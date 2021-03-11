package com.cqp.encryptspringbootstarter.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cqp
 * @version 1.0.0
 * @ClassName EncryptProperties.java
 * @Description 读取用户自定义的key
 * @createTime 2021年03月11日 09:56:00
 */
@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.itboyhub.com";
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
