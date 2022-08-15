package com.example.demo.service.resgister.impl;

import com.example.demo.controller.register.ResgisterRequest;
import com.example.demo.service.resgister.ResgisterService;
import org.springframework.stereotype.Service;

@Service
public class ResgisterServiceImpl implements ResgisterService {
    @Override
    public void string(ResgisterRequest s) {
        String a = null;
        a = s.getUsername();
        a = s.getPassword();
        return;
    }
}
