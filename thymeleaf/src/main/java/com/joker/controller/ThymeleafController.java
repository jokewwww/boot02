package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("show")
    public String showInfo(Model model){

        model.addAttribute("msg","this OK");

        return "index";
    }
}
