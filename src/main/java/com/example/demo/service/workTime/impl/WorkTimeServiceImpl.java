package com.example.demo.service.workTime.impl;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.example.demo.controller.workTime.WorkTimeListRequest;
import com.example.demo.controller.workTime.WorkTimeRequest;
import com.example.demo.entities.WorkTime;
import com.example.demo.mapper.WorkTimeMapper;
import com.example.demo.service.workTime.WorkTimeCondition;
import com.example.demo.service.workTime.WorkTimeResult;
import com.example.demo.service.workTime.WorkTimeService;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public WorkTimeResult getWorkTimeList(WorkTimeListRequest request) {
        WorkTimeResult result = new WorkTimeResult();
        WorkTimeCondition condition = new WorkTimeCondition();
        BeanUtils.copyProperties(request, condition);
        String userId = "003422";
        condition.setUserId(userId);
        long count = workTimeMapper.getWorkTimeListCount(condition);
        if (count != 0) {
            result.setList(workTimeMapper.getWorkTimeList(condition));
        }
//        result.setLimit(condition.getLimit());
//        result.setOffset(condition.getOffset());
//        result.setTotalCount(count);
        return result;
    }

    @Override
    public WorkTime createWorkTime(WorkTimeRequest request) {

        // convert to response
        WorkTime workTime = new WorkTime();
        WorkTimeCondition condition = new WorkTimeCondition();
        String id = request.getTargetDate() + request.getProjectId();
        String userId = "003422";
        condition.setUserId(userId);
        condition.setProjectId(request.getProjectId());
        condition.setTargetDate(request.getTargetDate());
        long count = workTimeMapper.getWorkTimeListCount(condition);
//        if (count != 0) {
//            throw new SystemException("当前日期和财务ID的申请记录已经存在，请确认日期和财务ID的内容是否正确。");
//        }
        BeanUtils.copyProperties(request, workTime);
        // ユーザID
        workTime.setUserId(userId);
        // 申請日
        workTime.setApplyDate(DateUtils.formatDate(new Date()));
        // 申請状態
        workTime.setStatusApply(request.getStatusApplyBool() ? "2" : "3");
        // 作成者
        workTime.setCreateBy(userId);
        // 更新者
        workTime.setUpdateBy(userId);

        workTimeMapper.creatWorkTime(workTime);
        return workTimeMapper.getWorkTimeCreateUse(userId, request.getTargetDate(), request.getProjectId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateWorkTimes(WorkTimeRequest request) {

        String userId = "003422";
        WorkTime workTime = new WorkTime();
        BeanUtils.copyProperties(request, workTime);
        // id
//        workTime.setId(request.getId());
        // ユーザID
        workTime.setUserId(userId);
        // 申請状態
        workTime.setStatusApply(request.getStatusApplyBool() ? "2" : "3");
        // 更新者
        workTime.setUpdateBy(userId);
        workTimeMapper.updateWorkTime(workTime);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteWorkTimes(List<String> ids) {

        for (String id : ids) {
            String[] split = id.split("\\_");
            // ユーザID
            String userId = split[0];
            // 残業日
            String targetDate = split[1];
            // プロジェクトID
            String projectId = split[2];
            workTimeMapper.deleteWorkTime(userId, targetDate, projectId);
        }
    }
}
