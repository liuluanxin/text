package com.example.demo.service.workTime;

import com.example.demo.entities.WorkTime;

import java.io.Serializable;
import java.util.List;


public class WorkTimeResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<WorkTime> list;

    public List<WorkTime> getList() {
        return list;
    }

    public void setList(List<WorkTime> list) {
        this.list = list;
    }
}
