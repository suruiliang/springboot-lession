package com.yuqiyu.rabbitmq.topic.common.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018-04-30.
 */
@Getter
public enum ExchangeEnum {
    /**
     * 用户注册交换配置枚举
     */
    USER_REGISTER_TOPIC_EXCHANGE("register.topic.exchange");
    private String name;

    ExchangeEnum(String name) {
        this.name = name;
    }
}
