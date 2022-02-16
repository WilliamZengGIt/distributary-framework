package com.grogu.distributary.framework.distributaryframework.redis;

import com.alibaba.fastjson.JSON;

/**
 * JOSN和Bean转换工具类
 *
 * @author long
 * @date 2022-02-17 1:48
 */
public class JsonBeanUtil {
    public static String beanToJson(Object o){
        return JSON.toJSONString(o);
    }
    //将JSON数据转成一个对象
    public static <T> T jsonToBean(String json,Class<T> cls){
        return JSON.parseObject(json,cls);
    }
}
