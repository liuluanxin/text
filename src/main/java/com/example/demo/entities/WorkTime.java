package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

public class WorkTime implements Serializable {

    private static final long serialVersionUID = -7490234820183311317L;

    private String id;

    private String userId;

    private String userName;

    private String targetDate;

    private String projectId;

    private String projectName;

    private String financialId;

    private String pmName;

    private String applyDate;

    private double time;

    private String comment;

    private String statusApply;

    private boolean statusApplyBool;

    private String statusPmApprove;

    private String statusDmApprove;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getFinancialId() {
        return financialId;
    }

    public void setFinancialId(String financialId) {
        this.financialId = financialId;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatusApply() {
        return statusApply;
    }

    public void setStatusApply(String statusApply) {
        this.statusApply = statusApply;
    }

    public boolean isStatusApplyBool() {
        return statusApplyBool;
    }

    public void setStatusApplyBool(boolean statusApplyBool) {
        this.statusApplyBool = statusApplyBool;
    }

    public String getStatusPmApprove() {
        return statusPmApprove;
    }

    public void setStatusPmApprove(String statusPmApprove) {
        this.statusPmApprove = statusPmApprove;
    }

    public String getStatusDmApprove() {
        return statusDmApprove;
    }

    public void setStatusDmApprove(String statusDmApprove) {
        this.statusDmApprove = statusDmApprove;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
