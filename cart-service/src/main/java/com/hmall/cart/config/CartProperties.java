package com.hmall.cart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * program: hmall
 * <p>
 * description:
 *
 * @author LIU JIA ZH-EN
 * <p>
 * email: liujiazhen@live.cn
 * create: 2024-03-28 13:46
 **/

@Data
@Component
@ConfigurationProperties(prefix = "hm.cart")
public class CartProperties {
    private Integer maxItems;
}
