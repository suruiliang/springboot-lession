package com.yuqiyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/15/015.
 */
@Controller
@RequestMapping(value = "/user")
public class IndexController {

    @GetMapping(value = "login_view")
    public String login(){
        return "login";
    }

    @GetMapping(value = "index")
    public String index(){
        return "index";
    }
}
