package com.joker.controller;


import com.joker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {


    @RequestMapping("show")
    public String showUser(Model model, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> userList=new ArrayList();

        userList.add(new User(1,"zs",23));
        userList.add(new User(2,"ls",25));
        userList.add(new User(3,"zwr",27));


        model.addAttribute("list",userList);

        return "userList";

    }
}
