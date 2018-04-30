package com.yuqiyu.lession27.controller;

import com.yuqiyu.lession27.bean.UserBean;
import com.yuqiyu.lession27.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-22.
 */
@RestController
public class UserController {
    //用户业务逻辑实现
    @Autowired
    private UserService userService;

    /**
     * 注册控制方法
     *
     * @param user 用户对象
     * @return
     */
    @RequestMapping(value = "/register")
    public String register
    (
            UserBean user
    ) {
        //调用注册业务逻辑
        userService.register(user);
        return "注册成功.";
    }
}
