package com.yuqiyu;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018-04-22.
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RestExceptionHandler {
    /**
     * 默认统一异常处理方法
     *
     * @param e 默认Exception异常对象
     * @return
     */
    @ExceptionHandler
    @ResponseStatus
    public ApiResult runtimeExceptionHandler(Exception e) {
        return ApiResultGenerator.errorResult(e.getMessage(), e);
    }
}
