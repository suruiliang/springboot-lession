package com.yuqiyu.lession44.mapping.entity;

import com.yuqiyu.lession44.mapping.aspect.ResourcePushItemEntity;
import lombok.Data;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
public class ResourcePushEntity {
    /**
     * 实体内的主键字段
     */
    private Field idField;
    /**
     * 资源设置项目实体列表
     * 用于处理一个实体内对应多个资源注解配置
     */
    private List<ResourcePushItemEntity> items = new ArrayList<ResourcePushItemEntity>();
}
