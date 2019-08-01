package com.joker.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入过滤器 springboot整合Filter方式2 :bean组件注册");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤完毕 springboot以bean组件方式整合Filter");
    }

    @Override
    public void destroy() {

    }
}
