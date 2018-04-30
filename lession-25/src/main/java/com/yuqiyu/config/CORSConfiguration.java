package com.yuqiyu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018-04-22.
 */
@Configuration
public class CORSConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
      /*  registry
                .addMapping("*//**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");*/
    }
}
