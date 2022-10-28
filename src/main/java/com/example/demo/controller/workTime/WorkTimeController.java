package com.example.demo.controller.workTime;

import com.example.demo.entities.WorkTime;
import com.example.demo.service.workTime.WorkTimeResult;
import com.example.demo.service.workTime.WorkTimeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class WorkTimeController {

    @Autowired
    private WorkTimeService workTimeService;

    /**
     * 加班时间单件检索
     *
     * @param id
     * @return
     */
    @GetMapping("/user-worktime/{id}")
    @Transactional(readOnly = true)
    public WorkTimeResponse getWorkTime(@PathVariable("id") String id) {
        WorkTime result = workTimeService.getWorkTime(id);
        WorkTimeResponse response = new WorkTimeResponse();
        BeanUtils.copyProperties(result, response);
        return response;
    }

    /**
     * 加班时间一览
     *
     * @param request
     * @return
     */
    @GetMapping("/user-worktime")
    @Transactional(readOnly = true)
    public WorkTimeListResponse getWorkTimeListForUser(WorkTimeListRequest request) throws ParseException {

        // call service
        WorkTimeResult result = workTimeService.getWorkTimeList(request);

        // convert to response
        WorkTimeListResponse response = new WorkTimeListResponse();
        BeanUtils.copyProperties(result, response);
        return response;
    }

    /**
     * 加班时间追加
     *
     * @param request
     * @return
     */
    @PostMapping("/user-extra-worktime")
    @Transactional
    public WorkTimeResponse addWorkTimeForUser(@RequestBody WorkTimeRequest request) {

        // convert to response
        WorkTimeResponse response = new WorkTimeResponse();

        WorkTime workTime = workTimeService.createWorkTime(request);

        BeanUtils.copyProperties(workTime, response);
        return response;
    }

    /**
     * 加班时间更新
     *
     * @param request
     * @return
     */
    @PutMapping("/user-extra-worktime/{id}")
    @Transactional
    public void updateWorkTimeForUser(@RequestBody WorkTimeRequest request) {

        // call service
        workTimeService.updateWorkTimes(request);
    }

    /**
     * 加班时间删除
     *
     * @param
     * @return
     */
    @DeleteMapping("/user-worktime")
    @Transactional
    public void deleteWorkTimeForUser(@RequestBody List<String> ids) {

        workTimeService.deleteWorkTimes(ids);
    }
}
