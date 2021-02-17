package com.whiteursa.cyberwizard.bot;

import com.whiteursa.cyberwizard.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component
public class CyberWizard extends TelegramLongPollingBot {
    private static final String BOT_NAME = "CyberWizard";
    private static final String BOT_TOKEN = "1596425405:AAFcyDW2aXvOds9O0e6NUzOfVLjvVyZFecA";
    private final IService serviceImpl;

    public CyberWizard(IService service) {
        serviceImpl = service;
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(this);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
            execute(serviceImpl.processUpdate(update));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
