package com.yuqiyu.rabbitmq.provider.rabbitmq;

import com.yuqiyu.rabbitmq.common.enums.ExchangeEnum;
import com.yuqiyu.rabbitmq.common.enums.QueueEnum;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * Created by Administrator on 2018-04-30.
 */
public interface QueueMessageService
        extends RabbitTemplate.ConfirmCallback {
    /**
     * 发送消息到rabbitmq消息队列
     *
     * @param message      消息内容
     * @param exchangeEnum 交换配置枚举
     * @param queueEnum    队列配置枚举
     * @throws Exception
     */
    public void send(Object message, ExchangeEnum exchangeEnum, QueueEnum queueEnum) throws Exception;
}
