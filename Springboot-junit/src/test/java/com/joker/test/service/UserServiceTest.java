package com.joker.test.service;


import com.joker.application.JunitApplication;
import com.joker.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@SpringBootTest(classes = JunitApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)//springBoot启动器
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAddUser(){
        userService.addUser();
    }
}
