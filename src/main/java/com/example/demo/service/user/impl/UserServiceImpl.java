package com.example.demo.service.user.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.entities.User;
import com.example.demo.service.user.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    
    protected UserMapper userMapper;

    @Override
    public Long getLogin(User user) {
        String userName = user.getUserName();
        String passWord = user.getPassWord();
        long count = userMapper.getUser(userName,passWord);
        return count;
    }

    @Override
    public void register(User user) {
        String a = null;
//        a = user.getUsername();
//        a = user.getPassword();
        return;

    }
}
