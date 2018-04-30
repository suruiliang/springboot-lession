package com.yuqiyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/14/014.
 */
@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping(value = "/index")
    public String index(){
        return "hello world!";
    }

}
