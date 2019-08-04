package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot处理异常方式二
 */
@ComponentScan("com.joker")
@SpringBootApplication
public class ExcepnApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExcepnApplication.class,args);
  }
}
