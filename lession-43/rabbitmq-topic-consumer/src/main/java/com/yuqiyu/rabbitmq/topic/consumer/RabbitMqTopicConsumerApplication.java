package com.yuqiyu.rabbitmq.topic.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2018-04-30.
 */
@SpringBootApplication
@ComponentScan(value = "com.yuqiyu.rabbitmq")
public class RabbitMqTopicConsumerApplication {

    /**
     * logback
     */
    private static Logger logger = LoggerFactory.getLogger(RabbitMqTopicConsumerApplication.class);

    /**
     * 程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RabbitMqTopicConsumerApplication.class, args);

        logger.info("【【【【【Topic队列消息Consumer启动成功】】】】】");
    }
}