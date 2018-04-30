package com.yuqiyu.lession37.annotation;

import com.yuqiyu.lession37.enums.ContentSecurityAway;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018-04-28.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentSecurity {
    /**
     * 内容加密方式
     * 默认DES
     *
     * @return
     */
    ContentSecurityAway away() default ContentSecurityAway.DES;
}
