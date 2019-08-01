package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")
public class FreeMarkerApplication {
  public static void main(String[] args) {
      SpringApplication.run(FreeMarkerApplication.class,args);
  }
}
