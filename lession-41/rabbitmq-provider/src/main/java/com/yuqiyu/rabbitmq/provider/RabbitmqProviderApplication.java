package com.yuqiyu.rabbitmq.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018-04-30.
 */
@SpringBootApplication(scanBasePackages = "com.yuqiyu.rabbitmq")
public class RabbitmqProviderApplication {
    static Logger logger = LoggerFactory.getLogger(RabbitmqProviderApplication.class);

    /**
     * 消息队列提供者启动入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqProviderApplication.class, args);

        logger.info("【【【【【消息队列-消息提供者启动成功.】】】】】");
    }
}
