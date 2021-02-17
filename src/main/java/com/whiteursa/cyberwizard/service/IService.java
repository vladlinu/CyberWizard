package com.whiteursa.cyberwizard.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.Optional;

public interface IService {
    void addUser(User user);
    Optional<User> getUser(Integer id);
    SendMessage processUpdate(Update update);
}
