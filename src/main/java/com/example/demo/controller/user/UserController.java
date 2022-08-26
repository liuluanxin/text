package com.example.demo.controller.user;

import com.example.demo.entities.User;
import com.example.demo.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    protected UserService userService;

    @ResponseBody
    @PostMapping("/user/login")
    public void login(User request) {

        userService.getLogin(request);

    }

    @PostMapping("/user/register")
    public void register(User user) {

        userService.register(new User());
    }
}
