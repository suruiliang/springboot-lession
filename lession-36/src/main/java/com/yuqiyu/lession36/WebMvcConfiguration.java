package com.yuqiyu.lession36;

import com.yuqiyu.lession36.resolver.CustomerArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Created by Administrator on 2018-04-26.
 */
@Configuration
public class WebMvcConfiguration
        implements WebMvcConfigurer {
    /**
     * 添加参数装载
     *
     * @param argumentResolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        /**
         * 将自定义的参数装载添加到spring内托管
         */
        argumentResolvers.add(new CustomerArgumentResolver());
    }

    /**
     * 配置静态请求视图映射
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
    }
}

