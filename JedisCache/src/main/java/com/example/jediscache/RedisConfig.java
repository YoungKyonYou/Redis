package com.example.jediscache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
@EnableMBeanExport(registration= RegistrationPolicy.IGNORE_EXISTING)
@Component
public class RedisConfig {


    @Bean
    public JedisPool createJedisPool(){
        return new JedisPool("127.0.0.1",6379);
    }
}
