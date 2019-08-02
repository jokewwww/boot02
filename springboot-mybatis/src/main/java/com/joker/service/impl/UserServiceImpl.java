package com.joker.service.impl;


import com.joker.mapper.UserMapper;
import com.joker.pojo.User;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> selUser() {
        return userMapper.selUser();
    }
}
