package com.joker.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@ComponentScan("com.joker")

@EntityScan("com.joker.pojo")

@SpringBootApplication
public class JunitApplication {
  public static void main(String[] args) {
      SpringApplication.run(JunitApplication.class,args);
  }
}
