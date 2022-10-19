package com.example.demo.service.workTime;

import com.example.demo.entities.WorkTime;
import com.example.demo.entities.WorkTimeForDisplay;

import java.io.Serializable;
import java.util.List;


public class WorkTimeResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<WorkTimeForDisplay> list;

    public List<WorkTimeForDisplay> getList() {
        return list;
    }

    public void setList(List<WorkTimeForDisplay> list) {
        this.list = list;
    }
}
