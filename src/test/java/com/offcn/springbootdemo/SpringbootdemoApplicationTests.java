package com.offcn.springbootdemo;

import com.offcn.springbootdemo.mapper.UserMapper;
import com.offcn.springbootdemo.pojo.MUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootdemoApplication.class)
class SpringbootdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getUserList() {
        List<MUser> userList = userMapper.getUserList();
        for (MUser user : userList){
            System.out.println(user);
        }
    }
    @Test
    public void add(){
        redisTemplate.opsForValue().set("name","zhangsan");
        String name = (String)redisTemplate.opsForValue().get("name");
        System.out.println(name);

        MUser user = new MUser();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("123");
        user.setName("超人");
        redisTemplate.opsForValue().set("user",user);
        MUser user1 = (MUser)redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }

}
