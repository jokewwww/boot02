package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.Thymeleaf;

@SpringBootApplication
@ComponentScan("com.joker")
public class ThymeleafApplication {
  public static void main(String[] args) {
      SpringApplication.run(ThymeleafApplication.class,args);
  }
}
