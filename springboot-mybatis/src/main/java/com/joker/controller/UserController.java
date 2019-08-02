package com.joker.controller;

import com.joker.pojo.User;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    //页面跳转配置

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("addUser")
    public String addUser(User user){
        int i = userService.insertUser(user);
        System.out.println("插入的最新数据为"+user.getId());
        return "ok";
    }
}
