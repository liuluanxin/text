package com.example.demo.service.user.impl;

import com.example.demo.controller.user.UserRequest;
import com.example.demo.controller.user.UserResponse;
import com.example.demo.dao.UserDao;
import com.example.demo.entities.User;
import com.example.demo.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    protected UserDao userDao;

    @Override
    public void getLogin(UserRequest request) {
        UserResponse res = new UserResponse();
//        long count = userDao.getUser(request);
        res.setPassWord(request.getPassWord());
        res.setUserName(request.getUserName());
    }

    @Override
    public void register(User user) {
        String a = null;
        a = user.getUsername();
        a = user.getPassword();
        return;

    }
}
