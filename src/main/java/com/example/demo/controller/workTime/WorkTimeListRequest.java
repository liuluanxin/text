package com.example.demo.controller.workTime;

import java.io.Serializable;

public class WorkTimeListRequest implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4858871295057362329L;

    /** the year */
    private String year;

    /** the month */
    private String month;

    /** the project id */
    private String projectId;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
