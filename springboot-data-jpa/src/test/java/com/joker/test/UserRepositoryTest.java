package com.joker.test;


import com.joker.DataApplication;
import com.joker.dao.UserRepository;
import com.joker.dao.UserRepositoryByName;
import com.joker.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@SpringBootTest(classes= {DataApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Autowired
    UserRepositoryByName userRepositoryByName;


    @Test
    public void testSave(){
        User user = new User("zhangsan", 23, "乌鲁木齐骚猪");
        repository.save(user);
    }

    @Test
    public void test1(){
        List<User> byName = userRepositoryByName.findByName("zhangsan");

        for (User user:byName ) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        List<User> byName = userRepositoryByName.findByNameAndAge("zhangsan", 23);

        for (User user:byName ) {
            System.out.println(user);
        }
    }

    @Test
    public void test3(){
        List<User> like = userRepositoryByName.findByNameLike("zhang%");

        for (User user :like ) {
            System.out.println(user);
        }
    }
}
