package com.mnnu.admin.interceptor;


import com.mnnu.common.entity.domain.GymManagerUserDO;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        GymManagerUserDO gymManagerUserDO = (GymManagerUserDO) session.getAttribute("manager");
        if (gymManagerUserDO == null) {
            response.sendRedirect("login.html");
            return false;
        }
        return true;
    }
}
