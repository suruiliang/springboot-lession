package com.yuqiyu.lession19.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-22.
 */
@RestController
@RequestMapping(value = "/api")
public class IndexController {

    @RequestMapping(value = "/index")
    public String index() {
        return "success";
    }
}
