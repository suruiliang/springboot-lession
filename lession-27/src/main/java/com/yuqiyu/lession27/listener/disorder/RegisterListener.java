package com.yuqiyu.lession27.listener.disorder;

import com.yuqiyu.lession27.bean.UserBean;
import com.yuqiyu.lession27.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-04-22.
 */
//@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent> {
    /**
     * 实现监听
     *
     * @param userRegisterEvent
     */
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("注册信息，用户名：" + user.getName() + "，密码：" + user.getPassword());

    }
}
