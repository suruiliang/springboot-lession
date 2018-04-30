package com.yuqiyu.springboot.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018-04-29.
 */
@SpringBootApplication
public class ExceptionApplication {
    /**
     * logger new instance
     */
    static Logger logger = LoggerFactory.getLogger(ExceptionApplication.class);

    /**
     * 程序入口方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(ExceptionApplication.class, args);
        logger.info("【【【【【业务异常统一处理-启动完成】】】】】");
    }
}
