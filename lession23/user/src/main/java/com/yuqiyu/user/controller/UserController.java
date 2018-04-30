package com.yuqiyu.user.controller;

import com.yuqiyu.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/4/17/017.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user/index")
    public String index(HttpServletRequest request, UserBean user) {
        request.setAttribute("name", user.getName());
        return "user_index";
    }
}
