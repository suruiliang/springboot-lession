package com.yuqiyu.controller;

import com.yuqiyu.entity.UserEntity;
import com.yuqiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19/019.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @GetMapping(value = "/list")
    public List<UserEntity> list()
    {
        return userService.list();
    }
}
