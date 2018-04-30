package com.yuqiyu.rabbitmq.lazy.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-04-30.
 */
@Component
@RabbitListener(queues = "message.center.create")
public class MessageConsumer {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @RabbitHandler
    public void handler(String content) {
        logger.info("消费内容：{}", content);
    }
}
