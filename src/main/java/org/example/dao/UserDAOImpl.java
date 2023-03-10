package org.example.dao;

import org.example.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements Dao {

    private final EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserBiId(int id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
        entityManager.close();
    }

    @Override
    @Transactional
    public void updateUser(User updateUser) {
        entityManager.merge(updateUser);
    }

    @Override
    @Transactional
    public void removeUserBiId(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM Usersdb user", User.class).getResultList();
    }
}
