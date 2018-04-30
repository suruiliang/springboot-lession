package com.yuqiyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2018/4/14/014.
 */
@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
