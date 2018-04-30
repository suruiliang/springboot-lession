package com.yuqiyu.lession44.controller;

import com.yuqiyu.lession44.entity.UserDetailDTO;
import com.yuqiyu.lession44.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-29.
 */
@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

    /**
     * 用户基本信息业务逻辑实现
     */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 根据用户名查询详情
     *
     * @param userName 用户名
     * @return
     */
    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public UserDetailDTO detail(@PathVariable("userName") String userName) {
        return userInfoService.selectByUserName(userName);
    }
}
