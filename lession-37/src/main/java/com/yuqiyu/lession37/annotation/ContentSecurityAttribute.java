package com.yuqiyu.lession37.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018-04-28.
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentSecurityAttribute {
    /**
     * 参数值
     * 对应配置@ContentSecurityAttribute注解的参数名称即可
     *
     * @return
     */
    String value();
}
