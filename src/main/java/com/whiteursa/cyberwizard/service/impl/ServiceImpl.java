package com.whiteursa.cyberwizard.service.impl;

import com.whiteursa.cyberwizard.bomber.IBomber;
import com.whiteursa.cyberwizard.persistence.model.Status;
import com.whiteursa.cyberwizard.persistence.repository.IRepository;
import com.whiteursa.cyberwizard.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.Optional;

@Service
public class ServiceImpl implements IService {

    private static final String greeting = "Привет, для начала работы проверим твою подписку на наш канал.\n Если подписка имеется напиши <подписан>";
    private static final String usage = "Для начала атаки бомбера напиши номер в виде 868274783. Кстати это только для номеров +380";
    private static final String attackStarted = "Атака началась. Приятного просмотра!";
    private static final String invalidNumber = "Извините этот номер какой-то неправильный!";
    private static final String unknown = "Я не знаю такой комманды";

    private IRepository repo;
    private IBomber bomber;

    public ServiceImpl() {
    }

    @Autowired
    public ServiceImpl(IRepository repository, IBomber bomber) {
        this.repo = repository;
        this.bomber = bomber;
    }

    @Override
    public void addUser(User user) {
        repo.addUser(user);
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return repo.getUser(id);
    }

    @Override
    public SendMessage processUpdate(Update update) {
        User user = update.getMessage().getFrom();
        String chatId = update.getMessage().getChatId().toString();
        if (repo.getUser(user.getId()).isEmpty()) {
            repo.addUser(user);
            return new SendMessage(chatId, greeting);
        } else if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText().trim();
            if (message.equals("подписан")) {
                // Check if user is actually subscribed
                repo.setUserState(user.getId(), Status.REGISTERED);
                return new SendMessage(chatId, usage);
            }

            try {
                if (repo.getUserState(user.getId()) == Status.REGISTERED) {
                    if (isValid(message)) {
                        bomber.bomb(message, 2);
                        return new SendMessage(chatId, attackStarted);

                    } else {
                        return new SendMessage(chatId, invalidNumber);
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new SendMessage(chatId, unknown);
    }

    private boolean isValid(String message) {
        for (char c : message.toCharArray()) {
            if (!((c == '0')||(c == '1')||(c == '2')||(c == '3')||(c == '4')||(c == '5')||(c == '6')||(c == '7')||(c == '8')||(c == '9'))) {
                return false;
            }
        }
        return true;
    }
}
