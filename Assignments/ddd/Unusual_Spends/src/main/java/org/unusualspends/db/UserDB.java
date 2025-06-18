package org.unusualspends.db;

import org.unusualspends.domain.entity.Transaction;
import org.unusualspends.domain.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private final List<User> users;

    public UserDB() {
        users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
