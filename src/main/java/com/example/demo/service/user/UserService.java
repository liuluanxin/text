package com.example.demo.service.user;

import com.example.demo.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getLogin(User user);

    void register(User user);
}
