package com.joker.service;


import com.joker.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    int insertUser(User user);

    List<User> selUser();


}
