package eurekaserver.server;

import coderServer.EurekaClientApplication;
import coderServer.tkmabatis.entity.User;
import coderServer.tkmabatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EurekaClientApplication.class)
public class MybatisGenerator {

    @Test
    public void contextLoads() {
    }

    @Autowired
    UserMapper userMapper;
    @Test
    public void testTwo() {

        Example example=new Example(User.class);
        example.selectProperties("age").createCriteria().andEqualTo("id",3);
        System.out.println(userMapper.selectByExample(example));
//        System.out.println(userMapper.selectOne(user));
    }
}
