package com.yuqiyu;

import com.yuqiyu.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/4/21/021.
 */
public interface UserJPA extends JpaRepository<UserEntity, Long> {
    //使用SpringDataJPA方法定义查询
    public UserEntity findByUsername(String username);
}
