package com.joker.dao;

import com.joker.pojo.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface UserRepositoryQuery extends Repository<User,Integer> {


    @Query("from User where name =:name  ")
    List<User> queryByNameHQL(String name);

    @Query(value = " select * from t_user where name=:name ",nativeQuery = true)
    List<User> queryByNamSQL(String name);

    @Modifying
    @Query(value = "update User set  name=:name where id=:id")
    void updateNameById(String name,Integer id);
}
