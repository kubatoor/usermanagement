package com.example.usermanagement.controller;

import com.example.usermanagement.UsermanagementApplication;
import com.example.usermanagement.service.UserManagementService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import static org.junit.Assert.*;

public class UserManagementControllerTest {
    MockMvc mockMvc;
    @Mock
    private UserManagementService userManagementService;
    @InjectMocks
    private UserManagementController userManagementController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(new UserManagementController())
                .build();
    }


    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void createUser() throws Exception {
    }

    @Test
    public void getAllUsers() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void deleteUserByEmail() throws Exception {
    }

}