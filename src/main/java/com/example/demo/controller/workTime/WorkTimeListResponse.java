package com.example.demo.controller.workTime;

import com.example.demo.entities.WorkTimeForDisplay;

import java.util.Date;
import java.util.List;

public class WorkTimeListResponse {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1931388283631681131L;

    /**
     * 残業情報リスト
     */
    private List<WorkTimeForDisplay> list;

    /**
     * the getter of list
     *
     * @return the list
     */
    public List<WorkTimeForDisplay> getList() {
        return list;
    }

    public void setList(List<WorkTimeForDisplay> list) {
        this.list = list;
    }
}
