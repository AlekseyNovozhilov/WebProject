package org.example.service;

import org.example.Model.User;
import org.example.dao.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDAOImpl userDAO;
    @Override
    public User getUserBiId(int id) {
        return userDAO.getUserBiId(id);
    }
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
    @Override
    public void removeUserBiId(int id) {
        userDAO.removeUserBiId(id);
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
