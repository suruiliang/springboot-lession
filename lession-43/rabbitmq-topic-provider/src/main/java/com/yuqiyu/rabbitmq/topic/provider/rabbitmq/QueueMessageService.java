package com.yuqiyu.rabbitmq.topic.provider.rabbitmq;

import com.yuqiyu.rabbitmq.topic.common.enums.ExchangeEnum;

/**
 * Created by Administrator on 2018-04-30.
 */
public interface QueueMessageService {
    /**
     * 发送消息到rabbitmq消息队列
     *
     * @param message      消息内容
     * @param exchangeEnum 交换配置枚举
     * @param routingKey   路由key
     * @throws Exception
     */
    public void send(Object message, ExchangeEnum exchangeEnum, String routingKey) throws Exception;
}
