package com.example.usermanagement.service;

import com.example.usermanagement.dao.UserManagmentDao;
import com.example.usermanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagementServiceImpl implements UserManagementService{
    @Autowired
    private UserManagmentDao userManagmentDao;

    @Override
    public User getUserByEmail(final String email) {
        return userManagmentDao.getUserByEmail(email);
    }

    @Override
    public void saveUser(final User user) {
        userManagmentDao.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userManagmentDao.getAllUsers();
    }

    @Override
    public void updateUser(final User user) {
        userManagmentDao.updateUser(user);
    }

    @Override
    public void deleteUser(final String user) {
        userManagmentDao.deleteUser(user);
    }
}
