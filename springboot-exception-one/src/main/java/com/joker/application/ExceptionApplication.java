package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot处理异常方式一
 */
@ComponentScan("com.joker")
@SpringBootApplication
public class ExceptionApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExceptionApplication.class,args);
  }
}
