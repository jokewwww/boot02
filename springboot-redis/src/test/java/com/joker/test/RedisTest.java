package com.joker.test;

import com.joker.application.RedisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void test1(){
        redisTemplate.opsForValue().set("tom","joker");
    }

    @Test
    public void test2(){
        String key = (String)redisTemplate.opsForValue().get("tom");


        System.out.println(key);

    }
}
