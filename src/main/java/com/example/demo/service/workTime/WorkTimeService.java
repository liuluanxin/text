package com.example.demo.service.workTime;

import com.example.demo.controller.workTime.WorkTimeListRequest;
import com.example.demo.controller.workTime.WorkTimeRequest;
import com.example.demo.entities.WorkTime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkTimeService {
    public WorkTime getWorkTime(String id);

    WorkTimeResult getWorkTimeList(WorkTimeListRequest request);
    /**
     * 残業情報登録
     *
     */
    public WorkTime createWorkTime(WorkTimeRequest request);

    /**
     * 残業情報更新
     *
     */
    public void updateWorkTimes(WorkTimeRequest request);

    /**
     * 残業情報削除
     *
     */
    public void deleteWorkTimes(List<String> ids);
}
