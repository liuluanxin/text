package com.example.demo.service.workTime;

import com.example.demo.controller.workTime.WorkTimeRequest;
import com.example.demo.entities.WorkTime;
import org.springframework.stereotype.Service;

@Service
public interface WorkTimeService {
    public WorkTime getWorkTime(String id);
}
