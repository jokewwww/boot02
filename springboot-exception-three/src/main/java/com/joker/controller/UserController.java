package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @RequestMapping("user1")
    public String user1(){
        int []nums=new int[3];
        nums[4]=19;
        return "index";
    }


    @RequestMapping("user2")
    public String user2(){
        int s=231/0;
        return "index";
    }
}
