package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")
public class ResourceApplication {

  public static void main(String[] args) {
      SpringApplication.run(ResourceApplication.class,args);
  }
}
