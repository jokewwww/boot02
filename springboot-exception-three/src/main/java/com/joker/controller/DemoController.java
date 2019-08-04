package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("demo1")
    public String demo1(){
        String stt=null;
        stt.length();
        return "index";
    }

    @RequestMapping("demo2")
    public String demo2(){
        int i=19/0;
        return "index";
    }
}
