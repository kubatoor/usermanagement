package com.example.usermanagement.service;

import com.example.usermanagement.dao.UserManagmentDao;
import com.example.usermanagement.model.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserManagementServiceImplTest {
    @Mock
    private UserManagmentDao userManagmentDao;
    @InjectMocks
    private UserManagementServiceImpl userManagementService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getUserByEmail() throws Exception {
        User user = new User();
        user.setName("Test User");
        user.setEmail("testuser@gmail.com");

        when(userManagmentDao.getUserByEmail("testuser@gmail.com")).thenReturn(user);
        final User userByEmail = userManagementService.getUserByEmail("testuser@gmail.com");
        assertEquals(user, userByEmail);
        verify(userManagmentDao, times(1)).getUserByEmail("testuser@gmail.com");
    }

    @Test
    public void saveUser() throws Exception {
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