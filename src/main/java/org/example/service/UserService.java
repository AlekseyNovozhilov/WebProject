package org.example.service;

import org.example.Model.User;

import java.util.List;

public interface UserService {

    User getUserBiId(int id);

    void saveUser(User uer);

    void updateUser(User user);

    void removeUserBiId(int id);

    List<User> getAllUsers();
}
