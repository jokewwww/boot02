package com.joker.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.joker")

public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);
  }
}
