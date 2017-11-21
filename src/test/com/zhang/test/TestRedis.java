package com.zhang.test;

/**
 * Created by zhang yufei on 2017/11/21.
 */
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml","classpath:redis.xml"})
public class TestRedis {

    @Resource(name = "redisTemplate")
    private RedisTemplate<String, String> template; // inject the template as ListOperations
    //至于这个为什么可以注入。需要参考AbstractBeanFactory doGetBean
    //super.setValue(((RedisOperations) value).opsForValue());就这一行代码  依靠一个editor
    //@Resource(name = "redisTemplate")
    //private ValueOperations<String, Object> vOps;

    public void testSet(){
        template.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                byte [] key = "tempkey".getBytes();
                byte[] value = "tempvalue".getBytes();
                connection.set(key, value);
                return true;
            }
        });
    }

    /*public void testSet1(){
        vOps.set("tempkey", "tempvalue");
    }*/

}
