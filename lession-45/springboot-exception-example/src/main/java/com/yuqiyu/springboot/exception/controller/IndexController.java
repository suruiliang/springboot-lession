package com.yuqiyu.springboot.exception.controller;

import com.yuqiyu.springboot.exception.common.ApiResponseEntity;
import com.yuqiyu.springboot.exception.common.enums.ErrorCodeEnum;
import com.yuqiyu.springboot.exception.core.LogicException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-04-29.
 */
@RestController
public class IndexController {
    /**
     * 首页方法
     *
     * @return
     */
    @RequestMapping(value = "/index")
    public ApiResponseEntity<String> index() throws LogicException {
        /**
         * 模拟用户不存在
         * 抛出业务逻辑异常
         */
        if (true) {
            throw new LogicException(ErrorCodeEnum.USER_STATUS_FAILD.toString());
        }
        return ApiResponseEntity.<String>builder().data("this is index mapping").build();
    }
}