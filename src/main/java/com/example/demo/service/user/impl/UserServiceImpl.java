package com.example.demo.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getLogin(User user) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name", user.getUserName());
        wrapper.eq("pass_word", user.getPassWord());
        wrapper.eq("delete_flag", "0");
        User use = userMapper.selectOne(wrapper);

        return use;
    }

    @Override
    public void register(User user) {
        user.setDelete_flag("0");
        userMapper.insert(user);
    }
}
