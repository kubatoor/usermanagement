package com.example.usermanagement.dao;

import com.example.usermanagement.model.User;

import java.util.List;

public interface UserManagmentDao {
    User getUserByEmail(String email);
    void saveUser(User user);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(String user);
}
