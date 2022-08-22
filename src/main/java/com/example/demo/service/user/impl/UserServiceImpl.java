package com.example.demo.service.user.impl;

import com.example.demo.controller.user.UserRequest;
import com.example.demo.entities.User;
import com.example.demo.service.user.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User login(UserRequest request) {
        String a = null;
        a = request.getUsername();
        a = request.getPassword();
        return null;

    }

    @Override
    public void register(User user) {
        String a = null;
        a = user.getUsername();
        a = user.getPassword();
        return;

    }
}
