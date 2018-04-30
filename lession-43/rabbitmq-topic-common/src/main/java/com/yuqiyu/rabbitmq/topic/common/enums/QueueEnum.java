package com.yuqiyu.rabbitmq.topic.common.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018-04-30.
 */
@Getter
public enum QueueEnum {
    /**
     * 用户注册
     * 创建账户消息队列
     */
    USER_REGISTER_CREATE_ACCOUNT("register.account", "register.#"),
    /**
     * 用户注册
     * 发送注册成功邮件消息队列
     */
    USER_REGISTER_SEND_MAIL("register.mail", "register.#");
    /**
     * 队列名称
     */
    private String name;
    /**
     * 队列路由键
     */
    private String routingKey;

    QueueEnum(String name, String routingKey) {
        this.name = name;
        this.routingKey = routingKey;
    }
}
