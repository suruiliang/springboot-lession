package com.yuqiyu.service;

import com.yuqiyu.entity.UserEntity;
import com.yuqiyu.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19/019.
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {

    @Autowired
    private UserJPA userJPA;

    @Cacheable
    public List<UserEntity> list()
    {
        return userJPA.findAll();
    }
}
