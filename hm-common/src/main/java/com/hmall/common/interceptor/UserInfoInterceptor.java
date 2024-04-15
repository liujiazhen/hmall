package com.hmall.common.interceptor;

import com.hmall.common.utils.UserContext;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * program: hmall
 * <p>
 * description:
 *
 * @author LIU JIA ZH-EN
 * <p>
 * email: liujiazhen@live.cn
 * create: 2024-03-29 19:51
 **/

public class UserInfoInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userInfo = request.getHeader("user-info");
        if (userInfo != null && !userInfo.isEmpty()) {
            UserContext.setUser(Long.valueOf(userInfo));
        }
        return true;
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        UserContext.removeUser();
    }
}
