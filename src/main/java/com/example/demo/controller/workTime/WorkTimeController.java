package com.example.demo.controller.workTime;

import com.example.demo.entities.WorkTime;
import com.example.demo.service.workTime.WorkTimeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkTimeController {

    @Autowired
    private WorkTimeService workTimeService;

    @ApiOperation(value = "残業時間情報取得(単件)", produces = "application/json")
    @GetMapping("/user-worktime")
    @Transactional(readOnly = true)
    public WorkTimeResponse getWorkTime(@PathVariable("id")String id){
        WorkTime result = workTimeService.getWorkTime(id);
        WorkTimeResponse response = new WorkTimeResponse();
        BeanUtils.copyProperties(result,response);
        return response;
    }
}
