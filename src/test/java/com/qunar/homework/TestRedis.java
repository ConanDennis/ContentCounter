package com.qunar.homework;
import com.qunar.homework.pojo.User;
import com.qunar.homework.redis.RedisService;
import com.qunar.homework.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

/**
 * Created by yangli on 2016/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class TestRedis {

    @Resource
    RedisService redisService;

    @Resource
    private IUserService userService = null;

    @Test
    public void test3() {
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());

        System.out.println("--------------------------------" + user.toString());


    }
//
    @Test
    public void test1() {
//        redisService.set("redis_name","123");
        //RedisService redisService=new RedisService();
        redisService.set("test_name","abc");
        System.out.println("test1");
    }
//
    @Test
    public void test2(){
//        String str=redisService.get("java_ssm_redis_name",String.class);
        //edisService redisService=new RedisService();
       String tt=  redisService.get("test_name",String.class);
        System.out.println("test2"+tt);
    }
}


