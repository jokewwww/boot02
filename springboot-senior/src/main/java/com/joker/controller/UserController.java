package com.joker.controller;


import com.joker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("{page}")
    public String showPagr(@PathVariable String page){return page;}

    @RequestMapping("save")
    public String saveUser(User user){
        return "ok";
    }

}
