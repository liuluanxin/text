package com.example.demo.controller.workTime;

import com.example.demo.entities.WorkTime;
import com.example.demo.service.workTime.WorkTimeResult;
import com.example.demo.service.workTime.WorkTimeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkTimeController {

    @Autowired
    private WorkTimeService workTimeService;

    @ApiOperation(value = "残业时间情报取得(单件)", produces = "application/json")
    @GetMapping("/user-worktime/{id}")
    @Transactional(readOnly = true)
    public WorkTimeResponse getWorkTime(@PathVariable("id") String id) {
        WorkTime result = workTimeService.getWorkTime(id);
        WorkTimeResponse response = new WorkTimeResponse();
        BeanUtils.copyProperties(result, response);
        return response;
    }

    @ApiOperation(value = "残业时间情报取得(复数件)", produces = "application/json")
    @GetMapping("/user-worktime")
    @Transactional(readOnly = true)
    public WorkTimeListResponse getWorkTimeListForUser(WorkTimeListRequest request) {

        // call service
        WorkTimeResult result = workTimeService.getWorkTimeList(request);

        // convert to response
        WorkTimeListResponse response = new WorkTimeListResponse();
        BeanUtils.copyProperties(result, response);
        return response;
    }

    /**
     * 残業時間追加(ユーザ向け).
     *
     * @param request 残業時間追加
     * @return 残業時間ID
     */
    @ApiOperation(value = "残業時間追加(ユーザ向け).", produces = "application/json")
    @PostMapping("/user-extra-worktime")
    @Transactional
    public WorkTimeResponse addWorkTimeForUser(@RequestBody WorkTimeRequest request) {

        // convert to response
        WorkTimeResponse response = new WorkTimeResponse();
        WorkTime workTime = new WorkTime();
        // call service
        workTime = workTimeService.createWorkTime(request);
        BeanUtils.copyProperties(workTime, response);
        return response;
    }

    /**
     * 残業時間更新(ユーザ向け).
     *
     * @param request 残業時間更新
     * @return 残業時間ID
     */
    @ApiOperation(value = "残業時間更新(ユーザ向け).", produces = "application/json")
    @PutMapping("/user-extra-worktime/{id}")
    @Transactional
    public void updateWorkTimeForUser(@RequestBody WorkTimeRequest request) {

        // call service
        workTimeService.updateWorkTimes(request);
    }

    /**
     * 残業時間削除(ユーザ向け).
     *
     * @param request 残業時間削除
     * @return 残業時間ID
     */
    @ApiOperation(value = "残業時間削除(ユーザ向け).", produces = "application/json")
    @DeleteMapping("/user-extra-worktime")
    @Transactional
    public void deleteWorkTimeListForUser(@RequestBody List<WorkTimeRequest> request) {

        List<String> ids = new ArrayList<String>();
        for (WorkTimeRequest work : request) {
//            String id = work.getId();
//            ids.add(id);
        }
        // call service
        workTimeService.deleteWorkTimes(ids);
    }

    /**
     * 残業時間削除(ユーザ向け).
     *
     * @param request 残業時間削除
     * @return 残業時間ID
     */
    @ApiOperation(value = "残業時間削除(ユーザ向け).", produces = "application/json")
    @DeleteMapping("/user-extra-worktime/{id}")
    @Transactional
    public void deleteWorkTimeForUser(@RequestBody WorkTimeRequest request) {

        List<String> ids = new ArrayList<String>();
//        ids.add(request.getId());
        // call service
        workTimeService.deleteWorkTimes(ids);
    }
}
