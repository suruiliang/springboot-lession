package com.yuqiyu.user.controller;

import com.yuqiyu.user.bean.UserBean;
import com.yuqiyu.user.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/18/018.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询所有用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserBean> list(){
        return userJPA.findAll();
    }
}
