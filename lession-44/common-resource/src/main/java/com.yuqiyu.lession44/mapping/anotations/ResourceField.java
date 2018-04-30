package com.yuqiyu.lession44.mapping.anotations;

import com.yuqiyu.lession44.mapping.enums.CommonResourceFlag;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018-04-29.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ResourceField {

    /**
     * 读取资源是单条或者读条
     * true：读取多条资源地址，对应设置到List<String>集合内
     * false：读取单条资源地址，对应设置配置ResourceField注解的字段value
     *
     * @return
     */
    boolean multiple() default false;

    /**
     * 配置读取统一资源的标识类型
     *
     * @return
     */
    CommonResourceFlag flag();

    /**
     * 如果配置该字段则不会去找@Id配置的字段
     * 该字段默认为空，则默认使用@Id标注的字段的值作为查询统一资源的target_id
     *
     * @return
     */
    String targetIdField() default "";
}
