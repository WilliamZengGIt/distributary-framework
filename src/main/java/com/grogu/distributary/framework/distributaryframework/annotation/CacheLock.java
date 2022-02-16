package com.grogu.distributary.framework.distributaryframework.annotation;

import java.lang.annotation.*;

/**
 *自定义注解
 * 主要是封装了redis锁前缀
 * 锁时间
 * key在redis里存在的时间 1000s
 * @author long
 * @date 2022-02-17 1:40
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheLock {
    String lockedPrefix() default "";//redis 锁key的前缀
    long timeOut() default 2000;//锁时间
    int expireTime() default 100000;//key在redis里存在的时间，1000S
}
