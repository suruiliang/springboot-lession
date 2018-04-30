package com.yuqiyu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/22/022.
 */
@RestController
@RequestMapping("/secure")
public class SecureController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Secure Hello!";
    }

}
