package com.example.demo.controller.user;

import com.example.demo.entities.User;
import com.example.demo.service.user.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/login")
    public void login(UserRequest request) {

        userService.login(request);

    }

    @PostMapping("/user/register")
    public void register(User user) {

        userService.register(new User());
    }
}
