package com.yuqiyu.rabbitmq.common.configuration;

import com.yuqiyu.rabbitmq.common.enums.ExchangeEnum;
import com.yuqiyu.rabbitmq.common.enums.QueueEnum;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018-04-30.
 */
@Configuration
public class UserRegisterQueueConfiguration {
    /**
     * 配置路由交换对象实例
     *
     * @return
     */
    @Bean
    public DirectExchange userRegisterDirectExchange() {
        return new DirectExchange(ExchangeEnum.USER_REGISTER.getValue());
    }

    /**
     * 配置用户注册队列对象实例
     * 并设置持久化队列
     *
     * @return
     */
    @Bean
    public Queue userRegisterQueue() {
        return new Queue(QueueEnum.USER_REGISTER.getName(), true);
    }

    /**
     * 将用户注册队列绑定到路由交换配置上并设置指定路由键进行转发
     *
     * @return
     */
    @Bean
    public Binding userRegisterBinding() {
        return BindingBuilder.bind(userRegisterQueue()).to(userRegisterDirectExchange()).with(QueueEnum.USER_REGISTER.getRoutingKey());
    }
}
