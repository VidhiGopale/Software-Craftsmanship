package org.unusualspends.repo;

import org.unusualspends.db.UserDB;
import org.unusualspends.domain.entity.User;

import java.util.List;

public class UserRepo {

    private final UserDB userDB;

    public UserRepo(UserDB userDB) {
        this.userDB = userDB;
    }

    public void addUser(User user) {
        this.userDB.addUser(user);
    }

    public List<User> getAllUsers() {
        return this.userDB.getUsers();
    }
}