package com.example.demo.service.login.impl;

import com.example.demo.entities.Student;
import com.example.demo.service.login.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Student string(Student s) {
        String a = null;
        a = s.getUsername();
        a = s.getPassword();
        return s;

    }
}
