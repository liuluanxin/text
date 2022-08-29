package com.example.demo.service.workTime.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.demo.entities.WorkTime;
import com.example.demo.mapper.WorkTimeMapper;
import com.example.demo.service.workTime.WorkTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkTimeServiceImpl implements WorkTimeService {

    @Autowired
    WorkTimeMapper workTimeMapper;

    @Override
    public WorkTime getWorkTime(String id) {
        WorkTime work = new WorkTime();
        String[] split = id.split("\\_");
        //用户ID
        String userId = split[0];
        //残业日
        String targetDate = split[1];
        //项目ID
        String projectId = split[2];
        work = workTimeMapper.getWorkTime(userId, targetDate, projectId);
        work.setStatusApplyBool(StringUtils.equals(work.getStatusApply(), "2") ? true : false);
        return work;
    }
}
