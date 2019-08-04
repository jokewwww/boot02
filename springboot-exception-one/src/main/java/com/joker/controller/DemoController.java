package com.joker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Springboot处理异常方式一
 * 自定义错误页面
 */
@Controller
public class DemoController {

    @RequestMapping("/show")
    public String showInfo(){

        String tr=null;
        tr.length();
        return "index";
    }
}
