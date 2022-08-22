package com.example.demo.controller.demo;

import com.example.demo.entities.User;
import com.example.demo.service.demo.impl.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("get")
    public void test() {
        demoService.learn(new User());
    }
}
