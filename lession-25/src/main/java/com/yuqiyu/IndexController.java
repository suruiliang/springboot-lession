package com.yuqiyu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-22.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/cors")
    public String corsIndex() {
        return "this is cors info.";
    }
}
