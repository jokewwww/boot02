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

    @Override
    public User byId(int id) {
        return userMapper.selUserById(id);
    }

    @Override
    public int updUser(User user) {
        return userMapper.updUser(user);
    }

    @Override
    public int delById(int id) {
        return userMapper.delById(id);
    }
}
