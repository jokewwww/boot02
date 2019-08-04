package com.joker.service;


import com.joker.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void addUser(){
        userMapper.addUser();
    }
}
