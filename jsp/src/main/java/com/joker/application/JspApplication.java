package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * springBoot整合jsp
 */
@SpringBootApplication
@ComponentScan("com.joker")
public class JspApplication {

  public static void main(String[] args) {
      SpringApplication.run(JspApplication.class,args);
  }
}
