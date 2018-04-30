package com.yuqiyu.rabbitmq.common.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018-04-30.
 */
@Getter
public enum ExchangeEnum {
    /**
     * 用户注册交换配置枚举
     */
    USER_REGISTER("user.register.topic.exchange");
    private String value;

    ExchangeEnum(String value) {
        this.value = value;
    }
}
