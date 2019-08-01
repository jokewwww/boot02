package com.joker.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SecondListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("springboot 组件注册方式 整合Listenenr");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
