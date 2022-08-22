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

    @GetMapping("/user/login")
    public UserResponse login(UserRequest request) {

        User user = userService.login(request);

        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(user, response);
        return response;
    }

    @PostMapping("/user/register")
    public void register(User user) {

        userService.register(new User());
    }
}
