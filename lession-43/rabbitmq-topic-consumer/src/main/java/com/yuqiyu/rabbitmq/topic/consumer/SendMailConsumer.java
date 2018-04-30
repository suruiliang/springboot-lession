package com.yuqiyu.rabbitmq.topic.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-04-30.
 */
@Component
@RabbitListener(queues = "register.mail")
public class SendMailConsumer {

    /**
     * logback
     */
    Logger logger = LoggerFactory.getLogger(SendMailConsumer.class);

    /**
     * 处理消息
     * 创建用户账户
     *
     * @param userId 用户编号
     */
    @RabbitHandler
    public void handler(String userId) {
        logger.info("用户：{}，注册成功，自动发送注册成功邮件.",userId);

        //... 创建账户逻辑
    }
}
