package com.yuqiyu;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2018/4/15/015.
 */
//@Configuration
public class ServletConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new TestServlet(),"/test");
    }
}
