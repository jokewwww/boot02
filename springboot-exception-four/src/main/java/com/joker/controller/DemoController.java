package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("demo1")
    public String demo1(){
        String str=null;
        str.length();
        return "index";
    }

    @RequestMapping("demo2")
    public String demo2(){
        int i=199/0;
        return "index";
    }

    @RequestMapping("demo3")
    public String demo3(){
        int []nums=new int[3];
        nums[4]=32;

        return "index";
    }
}
