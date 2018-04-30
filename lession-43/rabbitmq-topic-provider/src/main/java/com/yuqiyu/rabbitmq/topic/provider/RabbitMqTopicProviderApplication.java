package com.yuqiyu.rabbitmq.topic.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018-04-30.
 */
@SpringBootApplication(scanBasePackages ="com.yuqiyu.rabbitmq" )
public class RabbitMqTopicProviderApplication {

    /**
     * logback
     */
    private static Logger logger = LoggerFactory.getLogger(RabbitMqTopicProviderApplication.class);

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RabbitMqTopicProviderApplication.class,args);

        logger.info("【【【【【Topic队列消息Provider启动成功】】】】】");
    }
}
