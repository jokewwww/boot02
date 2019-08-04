package com.joker.controller;


import com.joker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    //@RequestMapping("{page}")
    public String showPagr(@PathVariable String page){return page;}

    @RequestMapping("add")
    public String showAdd(@ModelAttribute("u") User user){
        return "add";
    }

    /**
     * @param user 添加@Valid:开启堆User对象的数据校验
     * @param result @Valid 开启堆User对象的数据校验
     * @return
     */
    @RequestMapping("save")
    public String saveUser(@ModelAttribute("u") @Validated User user, BindingResult result){
        if (result.hasErrors()){
            return "add";
        }

        return "ok";
    }

}
