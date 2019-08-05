package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")
public class RedisApplication {

  public static void main(String[] args) {
      SpringApplication.run(RedisApplication.class,args);
  }
}
