package com.whiteursa.cyberwizard.persistence.repository.impl;

import com.whiteursa.cyberwizard.persistence.model.Status;
import com.whiteursa.cyberwizard.persistence.repository.IRepository;
import org.springframework.stereotype.Repository;
import org.telegram.telegrambots.meta.api.objects.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class RepositoryImpl implements IRepository {
    private final Map<User, Status> users = new HashMap<>();

    @Override
    public void addUser(User user) {
        users.put(user, Status.UNREGISTERED);
    }

    @Override
    public Optional<User> getUser(Integer id) {
        for (User user : users.keySet()) {
            if (user.getId().equals(id)) return Optional.of(user);
        }
        return Optional.empty();
    }

    @Override
    public void setUserState(Integer id, Status status) {
        for (User user : users.keySet()) {
            if (user.getId().equals(id)) users.put(user, status);
        }
    }

    @Override
    public Status getUserState(Integer id) throws Exception {
        for (User user : users.keySet()) {
            if (user.getId().equals(id)) return users.get(user);
        }
        throw new Exception("No user with id "+id+" found!");
    }
}
