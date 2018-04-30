package com.yuqiyu.rabbitmq.topic.provider.rabbitmq.support;

import com.yuqiyu.rabbitmq.topic.common.enums.ExchangeEnum;
import com.yuqiyu.rabbitmq.topic.provider.rabbitmq.QueueMessageService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-04-30.
 */
@Component
public class QueueMessageServiceSupport
        implements QueueMessageService {
    /**
     * 消息队列模板
     */
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(Object message, ExchangeEnum exchangeEnum, String routingKey) throws Exception {
        //发送消息到消息队列
        rabbitTemplate.convertAndSend(exchangeEnum.getName(), routingKey, message);
    }
}
