package com.grogu.distributary.framework.distributaryframework.redis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TOOD
 *
 * @author long
 * @date 2022-02-17 2:07
 */
public class RedisFactory {
    public static JedisPoolConfig getPoolConfig() throws IOException {
        Properties properties = new Properties();

        InputStream in = RedisFactory.class.getClassLoader().getResourceAsStream("redis.properties");

        try {
            properties.load(in);
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxIdle(Integer.parseInt(properties.getProperty("maxIdle", "100")));
            config.setMinIdle(Integer.parseInt(properties.getProperty("minIdle", "1")));
            config.setMaxTotal(Integer.parseInt(properties.getProperty("maxTotal", "1000")));
            return config;
        } finally {
            in.close();
        }

    }

    public static com.grogu.distributary.framework.distributaryframework.redis.RedisClient getDefaultClient(){
        JedisPool pool = new JedisPool("127.0.0.1");
        com.grogu.distributary.framework.distributaryframework.redis.RedisClient client = new  com.grogu.distributary.framework.distributaryframework.redis.RedisClient(pool);
        return client;
    }


}
