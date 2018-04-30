package com.yuqiyu.rabbitmq.topic.provider;

import com.yuqiyu.rabbitmq.topic.common.enums.ExchangeEnum;
import com.yuqiyu.rabbitmq.topic.common.enums.TopicEnum;
import com.yuqiyu.rabbitmq.topic.provider.rabbitmq.QueueMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Administrator on 2018-04-30.
 */
@Service
public class UserService {
    /**
     * 消息队列发送业务逻辑
     */
    @Autowired
    private QueueMessageService queueMessageService;

    /**
     * 随机创建用户
     * 随机生成用户uuid编号，发送到消息队列服务端
     *
     * @return
     * @throws Exception
     */
    public String randomCreateUser() throws Exception {
        //用户编号
        String userId = UUID.randomUUID().toString();
        //发送消息到rabbitmq服务端
        queueMessageService.send(userId, ExchangeEnum.USER_REGISTER_TOPIC_EXCHANGE, TopicEnum.USER_REGISTER.getTopicRouteKey());
        return userId;
    }
}