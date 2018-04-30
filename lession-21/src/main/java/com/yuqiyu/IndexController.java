package com.yuqiyu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-22.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index/{number}")
    public String index(@PathVariable int number) {
        System.out.println(20 / number);
        return "get index page successfully.";
    }
}
