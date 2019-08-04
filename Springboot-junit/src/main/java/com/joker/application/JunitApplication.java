package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.joker")
@SpringBootApplication
public class JunitApplication {
  public static void main(String[] args) {
      SpringApplication.run(JunitApplication.class,args);
  }
}
