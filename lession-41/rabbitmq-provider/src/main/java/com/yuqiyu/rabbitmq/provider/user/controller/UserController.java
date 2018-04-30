package com.yuqiyu.rabbitmq.provider.user.controller;

import com.yuqiyu.rabbitmq.provider.user.entity.UserEntity;
import com.yuqiyu.rabbitmq.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-30.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    /**
     * 用户业务逻辑
     */
    @Autowired
    private UserService userService;

    /**
     * 保存用户基本信息
     *
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/save")
    public UserEntity save(UserEntity userEntity) throws Exception {
        userService.save(userEntity);
        return userEntity;
    }
}
