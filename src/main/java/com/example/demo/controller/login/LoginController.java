package com.example.demo.controller.login;

import com.example.demo.entities.Student;
import com.example.demo.service.login.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    private final LoginService appService;

    public LoginController(LoginService appService) {
        this.appService = appService;
    }

    @PostMapping("/user/login")
    public void test(@RequestBody Student student) {
        appService.string(new Student());
        return;
    }
}
