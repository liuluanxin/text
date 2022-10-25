package com.example.demo.controller.workTime;

import com.example.demo.entities.WorkTime;

import java.io.Serializable;

public class WorkTimeRequest implements Serializable {

    private static final long serialVersionUID = -4858871295057362329L;

    /**
     * id
     */
    private String id;
    /**
     * 残業日
     */
    private String targetDate;

    /**
     * 残業時間
     */
    private double time;

    /**
     * プロジェクトID
     */
    private String projectId;

    /**
     * 申請状態
     */
    private boolean statusApplyBool;

    /**
     * 残業理由
     */
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public boolean getStatusApplyBool() {
        return statusApplyBool;
    }

    public void setStatusApplyBool(boolean statusApplyBool) {
        this.statusApplyBool = statusApplyBool;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
