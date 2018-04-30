package com.yuqiyu.springboot.exception.configuration.advice;

import com.yuqiyu.springboot.exception.common.ApiResponseEntity;
import com.yuqiyu.springboot.exception.core.LogicException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018-04-29.
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class ExceptionAdvice {

    /**
     * logback new instance
     */
    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 处理业务逻辑异常
     *
     * @param e 业务逻辑异常对象实例
     * @return 逻辑异常消息内容
     */
    @ExceptionHandler(LogicException.class)
    @ResponseStatus(code = HttpStatus.OK)
    public ApiResponseEntity<String> logicException(LogicException e) {
        logger.error("遇到业务逻辑异常：【{}】", e.getErrCode());
        // 返回响应实体内容
        return ApiResponseEntity.<String>builder().errorMsg(e.getErrMsg()).build();
    }
}
