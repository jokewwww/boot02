package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    /**
     *
     * @param e
     * @return ModelAndView 封装信息并返回视图
     */

    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView exception(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());

        modelAndView.setViewName("error");

        return modelAndView;
    }

    @RequestMapping("show")
    public String getInfo(){
        int i=10/0;
        return "index";
    }

    @RequestMapping("show1")
    public String getInfo1(){
        String str=null;
        str.length();
        return "index";
    }


    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView view(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
