package com.yuqiyu.springboot.exception.core.message;

/**
 * Created by Administrator on 2018-04-29.
 */
public interface LogicExceptionMessage {

    /**
     * 获取异常消息内容
     *
     * @param errCode 错误码
     * @return
     */
    public String getMessage(String errCode);
}
