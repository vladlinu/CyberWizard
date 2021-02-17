package com.whiteursa.cyberwizard.persistence.repository;

import com.whiteursa.cyberwizard.persistence.model.Status;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.Optional;

public interface IRepository {
    void addUser(User user);
    Optional<User> getUser(Integer id);
    void setUserState(Integer id, Status status);
    Status getUserState(Integer id) throws Exception;
}
