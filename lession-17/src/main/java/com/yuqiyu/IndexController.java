package com.yuqiyu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/21/021.
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public String index() {
        return "get index success";
    }
}
