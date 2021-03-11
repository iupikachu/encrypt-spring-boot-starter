package com.cqp.encryptspringbootstarter.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author cqp
 * @version 1.0.0
 * @ClassName Decrypt.java
 * @Description 解密注解
 * @createTime 2021年03月11日 09:51:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.PARAMETER})
public @interface Decrypt {
}
