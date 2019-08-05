package com.joker.test;


import com.joker.EhcacheApplication;
import com.joker.pojo.User;
import com.joker.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EhcacheApplication.class)
public class EhcacheTest {

    @Autowired
    private UserService userService;

    /**
     * 一条sql,2次输出,证明缓存起作用了
     *
     */
    @Test
    public void test1(){
        List<User> userAll = userService.findUserAll();
        for (User user:userAll ) {
            System.out.println(user);
        }

        System.out.println(userService.findUserAll());
    }

    @Test
    public void test2(){
        Pageable pageable = new PageRequest(0, 2);
        Page<User> byPage = userService.findByPage(pageable);
        for (User user:byPage ) {
            System.out.println(user);
        }
        Page<User> byPage1 = userService.findByPage(pageable);
        for (User user:byPage1 ) {
            System.out.println(user);
        }
        Pageable pageable2 = new PageRequest(1, 2);
        Page<User> byPage2 = userService.findByPage(pageable);
        for (User user:byPage ) {
            System.out.println(user);
        }


    }



}
