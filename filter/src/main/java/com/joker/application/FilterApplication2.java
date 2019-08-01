package com.joker.application;


import com.joker.filter.SecondFilter;
import com.joker.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.joker")
public class FilterApplication2 {

  public static void main(String[] args) {
      SpringApplication.run(FilterApplication2.class,args);
  }


  @Bean
  public ServletRegistrationBean getServletRegistrationBean(){
      ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
      bean.addUrlMappings("/servlet2");
      return bean;
  }

  @Bean
  public FilterRegistrationBean getFilterRegistrationBean(){
      FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
      filterRegistrationBean.addUrlPatterns("/servlet2");
      return  filterRegistrationBean;
  }
}
