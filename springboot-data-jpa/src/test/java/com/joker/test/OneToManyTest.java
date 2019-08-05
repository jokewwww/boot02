package com.joker.test;


import com.joker.DataApplication;
import com.joker.dao.UserRepository;
import com.joker.pojo.Role;
import com.joker.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= DataApplication.class)
public class OneToManyTest {

    @Autowired
    UserRepository userRepository;

    /**
     * 一对多关联关系的添加
     */
    @Test
    public void test1(){
        //1.创建用户
        User user = new User("zhaoliu", 34, "zangsan");
        //2.创建角色
        Role role = new Role();
        role.setRoleName("清洁工");
        //3.关联
        role.getUsers().add(user);
        user.setRole(role);
        //4.保存
        userRepository.save(user);

        List<User> all = userRepository.findAll();
        for (User use :all ) {
            System.out.println(use);
        }
    }

    /**
     * 一对多关联关系的查询
     */
    @Test
    public void test2(){
        User user = userRepository.findById(8).get();

        System.out.println(user);
        Role role = user.getRole();

        System.out.println(role.getRoleName());
    }

}
