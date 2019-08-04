package com.joker.dao;

import com.joker.pojo.User;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface UserRepositoryByName extends Repository<User,Integer> {

    List<User> findByName(String str);

    List<User> findByNameAndAge(String name,int age);

    List<User> findByNameLike(String name);
}
