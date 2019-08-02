package com.joker.application;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication()
@MapperScan("com.joker.mapper")
@ComponentScan("com.joker")
public class MybatisApplication {

  public static void main(String[] args) {
      SpringApplication.run(MybatisApplication.class,args);
  }
}
