package com.joker.mapper;


import com.joker.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    int addUser(User user);

    List<User> selUser();

    User selUserById(int id);

    int updUser(User user);

    int delById(int id);
}
