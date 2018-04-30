package com.yuqiyu.jpa;

import com.yuqiyu.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public interface UserJPA extends JpaRepository<UserEntity,Long> ,JpaSpecificationExecutor<UserEntity>,Serializable{
}
