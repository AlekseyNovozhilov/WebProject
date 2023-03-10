package org.example.dao;

import org.example.Model.User;

import java.util.List;

public interface Dao {
    User getUserBiId(int id);

    void saveUser(User uer);

    void updateUser(User user);

    void removeUserBiId(int id);

    List<User> getAllUsers();

}
