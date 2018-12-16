package com.lin.service;

import com.lin.mapper.UserMapper;
import com.lin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void insert(User user){
        userMapper.insert(user);
    }
}
