package com.yuqiyu.springboot.exception.configuration.support.message;

import com.yuqiyu.springboot.exception.core.message.LogicExceptionMessage;
import com.yuqiyu.springboot.exception.entity.ExceptionInfoEntity;
import com.yuqiyu.springboot.exception.repository.ExceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * Created by Administrator on 2018-04-29.
 */
@Component
public class LogicExceptionMessageSupport implements LogicExceptionMessage {

    /**
     * 异常数据接口
     */
    @Autowired
    private ExceptionRepository exceptionRepository;

    /**
     * 根据错误码获取错误信息
     *
     * @param errCode 错误码
     * @return
     */
    @Override
    public String getMessage(String errCode) {
        ExceptionInfoEntity exceptionInfoEntity = exceptionRepository.findTopByCode(errCode);
        if (!ObjectUtils.isEmpty(exceptionInfoEntity)) {
            return exceptionInfoEntity.getMessage();
        }
        return "系统异常";
    }
}
