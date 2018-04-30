package com.yuqiyu.rabbitmq.topic.common.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018-04-30.
 */
@Getter
public enum TopicEnum {
    /**
     * 用户注册topic路由key配置
     */
    USER_REGISTER("register.user");

    private String topicRouteKey;

    TopicEnum(String topicRouteKey) {
        this.topicRouteKey = topicRouteKey;
    }
}
