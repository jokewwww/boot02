package com.joker.test;


import com.joker.application.DataApplication;
import com.joker.dao.UserRepository;
import com.joker.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@SpringBootTest(classes= {DataApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testSave(){
        User user = new User("zhangsan", 23, "乌鲁木齐骚猪");
        userRepository.save(user);
    }
}
