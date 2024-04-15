package com.hmall.cart.config;

import com.hmall.common.utils.UserContext;
import feign.Logger;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;

/**
 * program: hmall
 * <p>
 * description:
 *
 * @author LIU JIA ZH-EN
 * <p>
 * email: liujiazhen@live.cn
 * create: 2024-03-27 19:07
 **/

public class DefaultFeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

    @Bean
    public RequestInterceptor userInfoRequestInterceptor() {
        return template -> {
            Long userId = UserContext.getUser();
            if (userId != null) {
                template.header("user-info", String.valueOf(userId));
            }
        };
    }
}
