package com.yuqiyu.rabbitmq.provider.user.service;

import com.yuqiyu.rabbitmq.common.enums.ExchangeEnum;
import com.yuqiyu.rabbitmq.common.enums.QueueEnum;
import com.yuqiyu.rabbitmq.provider.rabbitmq.QueueMessageService;
import com.yuqiyu.rabbitmq.provider.user.entity.UserEntity;
import com.yuqiyu.rabbitmq.provider.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018-04-30.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    @Autowired
    private UserRepository userRepository;
    /**
     * 消息队列业务逻辑实现
     */
    @Autowired
    private QueueMessageService queueMessageService;

    /**
     * 保存用户
     * 并写入消息队列
     *
     * @param userEntity
     * @return
     */
    public Long save(UserEntity userEntity) throws Exception {
        /**
         * 保存用户
         */
        userRepository.save(userEntity);
        /**
         * 将消息写入消息队列
         */
        queueMessageService.send(userEntity.getId(), ExchangeEnum.USER_REGISTER, QueueEnum.USER_REGISTER);

        return userEntity.getId();
    }
}