package com.example.demo.service.user;

import com.example.demo.controller.user.UserRequest;
import com.example.demo.controller.user.UserResponse;
import com.example.demo.entities.User;

public interface UserService {
    void login(UserRequest request);

    public void register(User user);
}
