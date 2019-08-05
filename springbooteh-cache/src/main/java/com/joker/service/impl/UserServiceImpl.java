package com.joker.service.impl;


import com.joker.dao.UserJpaRepository;
import com.joker.pojo.User;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJpaRepository userJpaRepository;

    /**
     * Cacheablez作用:把当前方法的返回值进行缓存
     * @return
     */
    @Cacheable(value = "user")
    @Override
    public List<User> findUserAll() {
        return userJpaRepository.findAll();
    }

    @Override
    public User findUserById(Integer i) {
        return userJpaRepository.findById(i).get();
    }

    @Cacheable(value = "user",key = "#pageable.pageSize")
    @Override
    public Page<User> findByPage(Pageable pageable) {
        return userJpaRepository.findAll(pageable);
    }

    @Override
    public void saveUser(User user) {
        userJpaRepository.save(user);
    }
}
