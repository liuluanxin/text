package com.example.demo.controller.register;

import com.example.demo.entities.Student;
import com.example.demo.service.login.LoginService;
import com.example.demo.service.resgister.ResgisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResgisterController {

    private final ResgisterService resgisterService;


    public ResgisterController(ResgisterService resgisterService) {
        this.resgisterService = resgisterService;
    }

    @PostMapping("/user/register")
    public void test(@RequestBody ResgisterRequest resgisterRequest) {
        
        resgisterService.string(new ResgisterRequest());
    }
}
