package com.joker.service;

import com.joker.pojo.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    List<User> findUserAll();
    User findUserById(Integer i);
    Page<User> findByPage(Pageable pageable);
    void saveUser(User user);

}
