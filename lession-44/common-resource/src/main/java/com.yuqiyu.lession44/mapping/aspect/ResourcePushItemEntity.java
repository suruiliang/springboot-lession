package com.yuqiyu.lession44.mapping.aspect;

import com.yuqiyu.lession44.mapping.anotations.ResourceField;
import lombok.Data;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
public class ResourcePushItemEntity {
    /**
     * 实体内配置@ResourceField的字段
     */
    private Field resourceField;
    /**
     * 实体内配置@ResourceField的targetId的值对应的字段
     */
    private Field targetIdField;
    /**
     * 配置资源注解实例
     */
    private ResourceField resourceAnnotation;
}
