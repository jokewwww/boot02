package com.joker.application;


import com.joker.servlet.Bootservlet02;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")
public class Application02 {

  public static void main(String[] args) {
      SpringApplication.run(Application02.class,args);
  }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new Bootservlet02());
        bean.addUrlMappings("/boot2");

        return bean;
    }
}
