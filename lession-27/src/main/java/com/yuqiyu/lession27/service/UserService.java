package com.yuqiyu.lession27.service;

import com.yuqiyu.lession27.bean.UserBean;
import com.yuqiyu.lession27.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018-04-22.
 */
@Service
public class UserService {
    @Autowired
    ApplicationContext applicationContext;

    /**
     * 用户注册方法
     *
     * @param user
     */
    public void register(UserBean user) {
        //../省略其他逻辑

        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}
