package com.yuqiyu.springboot.exception.common;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Administrator on 2018-04-29.
 */
@Data
@Builder
public class ApiResponseEntity<T extends Object> {
    /**
     * 错误消息
     */
    private String errorMsg;
    /**
     * 数据内容
     */
    private T data;
}
