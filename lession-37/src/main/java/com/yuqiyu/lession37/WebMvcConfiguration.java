package com.yuqiyu.lession37;

import com.yuqiyu.lession37.interceptor.ContentSecurityInterceptor;
import com.yuqiyu.lession37.resolver.ContentSecurityMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Created by Administrator on 2018-04-28.
 */
@Configuration
public class WebMvcConfiguration
        implements WebMvcConfigurer

{
    /**
     * 配置拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ContentSecurityInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        /**
         * 将自定义的参数装载添加到spring内托管
         */
        argumentResolvers.add(new ContentSecurityMethodArgumentResolver());
    }

}