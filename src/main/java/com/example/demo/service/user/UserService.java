package com.example.demo.service.user;

import com.example.demo.entities.User;

public interface UserService {
    Long getLogin(User user);

    void register(User user);
}
