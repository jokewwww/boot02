package com.joker.application;


import com.joker.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")
public class ListenerApplication02 {

  public static void main(String[] args) {
      SpringApplication.run(ListenerApplication02.class,args);
  }

  @Bean
  public ServletListenerRegistrationBean getServletListenerRegistrationBean(){
      ServletListenerRegistrationBean<SecondListener> secondListenerServletListenerRegistrationBean = new ServletListenerRegistrationBean<>(new SecondListener());
      return  secondListenerServletListenerRegistrationBean;
  }

}
