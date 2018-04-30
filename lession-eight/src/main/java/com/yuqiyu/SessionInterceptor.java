package com.yuqiyu;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURI());
        if (request.getRequestURI().equals("/user/login") || request.getRequestURI().equals("/user/login_view")) {
            return true;
        }
        Object obj = request.getSession().getAttribute("_session_user");
        if (obj == null) {
            response.sendRedirect("/user/login_view");
            return false;
        }
        return true;
    }
}
