package com.joker.service.impl;


import com.joker.mapper.UserMapper;
import com.joker.pojo.User;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        int i = userMapper.addUser(user);
        System.out.println(">>>"+user.getId());
        return i;
    }
}
