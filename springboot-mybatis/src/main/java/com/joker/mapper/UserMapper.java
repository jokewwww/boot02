package com.joker.mapper;


import com.joker.pojo.User;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserMapper {

    int addUser(User user);
}
