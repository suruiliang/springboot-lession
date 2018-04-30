package com.yuqiyu.lession44.mapping.service;

import java.util.List;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface ResourcePushService {
    /**
     * 设置单个实例的资源信息
     *
     * @param object 需要设置资源的实例
     */
    void push(Object object) throws Exception;

    /**
     * 设置多个实例的资源信息
     *
     * @param objectList 需要设置资源的实例列表
     */
    void push(List<Object> objectList) throws Exception;
}
