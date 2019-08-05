package com.joker.test;


import com.joker.DataApplication;
import com.joker.dao.UserCrudRepository;
import com.joker.dao.UserRepository;
import com.joker.dao.UserRepositoryByName;
import com.joker.dao.UserRepositoryQuery;
import com.joker.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@SpringBootTest(classes= {DataApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Autowired
    UserRepositoryByName userRepositoryByName;

    @Autowired
    UserRepositoryQuery userRepositoryQuery;

    @Autowired
    private UserCrudRepository userCrudRepository;


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

    /**
     * @Query的测试
     */
    @Test
    public void test4(){
        List<User> zhangsan = userRepositoryQuery.queryByNameHQL("zhangsan");
        for (User user :zhangsan ) {
            System.out.println(user);
        }
    }

    @Test
    public void test5(){
        List<User> queryByNamSQL = userRepositoryQuery.queryByNamSQL("zhangsan");
        for (User user :queryByNamSQL ) {
            System.out.println(user);
        }
    }

    @Test
    @Transactional
    @Rollback(false)
    public void test6(){

        userRepositoryQuery.updateNameById("zhangliu",2);
    }

    @Test
    public void test7(){
        User user = new User("liwang", 24, "太平洋");
        user.setId(3);
        userCrudRepository.save(user);
    }

    @Test
    public void test8(){
        User user = userCrudRepository.findById(2).get();
        System.out.println(user);
    }

    @Test
    public void test9(){
        Iterable<User> all = userCrudRepository.findAll();
        for (User user :all ) {
            System.out.println(user);
        }

    }

    @Test
    public void test10(){
        userCrudRepository.deleteById(2);
    }


}
