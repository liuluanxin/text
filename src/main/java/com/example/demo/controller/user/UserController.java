package com.example.demo.controller.user;

import com.example.demo.entities.User;
import com.example.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User request) {
        User use = userService.getLogin(request);
        return use;
    }

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        userService.register(user);
    }
}
