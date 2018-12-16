package com.lin.mapper;

import com.lin.pojo.User;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery(){
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println("user = " + user);
    }
}