package com.yuqiyu.lession27.listener.annotation;

import com.yuqiyu.lession27.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-04-22.
 */
//@Component
public class AnnotationRegisterUserEmailListener {
    /**
     * 发送邮件监听实现
     *
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void sendMail(UserRegisterEvent userRegisterEvent) {
        System.out.println("用户注册成功，发送邮件。");
    }
}
