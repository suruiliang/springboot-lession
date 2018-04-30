package com.yuqiyu.annotations;

import org.springframework.cache.annotation.Cacheable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018-04-29.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Cacheable(cacheNames = "user.service.detail", key = "#userId", unless = "#result?.userAge > 20")
public @interface SingleUserCache {
}
