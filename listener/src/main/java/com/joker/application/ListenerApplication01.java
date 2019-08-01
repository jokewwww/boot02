package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.joker")
public class ListenerApplication01 {
  public static void main(String[] args) {
      SpringApplication.run(ListenerApplication01.class,args);
  }
}
