package com.example.demo.service.user;

import com.example.demo.controller.user.UserRequest;
import com.example.demo.entities.User;

public interface UserService {
    public User login(UserRequest request);

    public void register(User user);
}
