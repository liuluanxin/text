package com.example.demo.dao;

import com.example.demo.controller.user.UserRequest;

public interface UserDao {

    long getUser(UserRequest params);
}
