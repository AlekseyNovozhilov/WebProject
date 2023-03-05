package org.example.dao;

import org.example.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDAOImpl implements Dao{
    @Override
    public User getUserBiId(int id) {
        return null;
    }

    @Override
    public void saveUser(User uer) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUserBiId(int id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
