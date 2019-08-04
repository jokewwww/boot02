package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * springBoot处理异常方式2:@ControllerAdvice+Handlerexception实现异常的复用
 */
@ComponentScan("com.joker")
@SpringBootApplication
public class ExApplication {
  public static void main(String[] args) {
      SpringApplication.run(ExApplication.class,args);
  }
}
