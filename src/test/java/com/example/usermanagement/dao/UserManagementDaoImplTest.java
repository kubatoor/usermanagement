package com.example.usermanagement.dao;

import com.example.usermanagement.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UserManagementDaoImplTest {
    private UserManagementDaoImpl userManagementDao;
    @Before
    public void setUp() throws Exception {
        userManagementDao = new UserManagementDaoImpl();
    }

    @Test
    public void getUserByEmail() throws Exception {
        User user = new User();
        user.setEmail("testuser@gmail.com");
        user.setName("Test User");
        user.setRoles(Arrays.asList("superuser"));
        userManagementDao.saveUser(user);
        final User userByEmail = userManagementDao.getUserByEmail("testuser@gmail.com");
        assertEquals(user, userByEmail);
    }

    @Test
    public void saveUser() throws Exception {
        User user = new User();
        user.setEmail("testuser@gmail.com");
        user.setName("Test User");
        user.setRoles(Arrays.asList("superuser"));
        userManagementDao.saveUser(user);
        final User userByEmail = userManagementDao.getUserByEmail("testuser@gmail.com");
        assertEquals(user, userByEmail);
    }

    @Test
    public void getAllUsers() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void deleteUser() throws Exception {
    }

}