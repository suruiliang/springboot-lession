package com.yuqiyu.rabbitmq.provider.user.repository;

import com.yuqiyu.rabbitmq.provider.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018-04-30.
 */
public interface UserRepository
        extends JpaRepository<UserEntity, Long> {
}
