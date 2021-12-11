package com.ivan.blog.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    public RedisUtil(RedisTemplate<Object, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
