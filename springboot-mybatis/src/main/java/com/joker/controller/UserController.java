package com.joker.controller;

import com.joker.pojo.User;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

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

    @RequestMapping("users")
    public String findAll(Model model){
        List<User> users = userService.selUser();
        model.addAttribute("list",users);
        return "showUser";

    }

    @RequestMapping("/selById")
    public String selUserById(String id,Model model){

        User user = userService.byId(Integer.parseInt(id));
        model.addAttribute("user",user);
        return "updUser";
    }

    @RequestMapping("edit")
    public String updUser(User user){
        userService.updUser(user);
        return "ok";
    }

    @RequestMapping("delete")
    public String delById(int id){
        userService.delById(id);
        return "redirect:/user/users";
    }

}
