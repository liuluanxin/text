package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
public class WorkTimeForDisplay implements Serializable {

    /**
     * the serialVersionUID
     */
    private static final long serialVersionUID = -4689520786245840754L;

    /**
     * ID_残業日_プロジェクトID
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
     * プロジェクト名
     */
    private String projectName;

    /**
     * 申請状態
     */
    private boolean statusApply;

    /**
     * PM承認状態
     */
    private Boolean statusPmApprove;

    /**
     * DM承認状態
     */
    private Boolean statusDmApprove;

    /**
     * 残業理由
     */
    private String comment;

    /**
     * ユーザ名
     */
    private String userName;

    /**
     * 主管PM
     */
    private String pmName;

    /**
     * ID_残業日_プロジェクトIDを設定する。
     *
     * @param id ID_残業日_プロジェクトID
     */
    public void setId(String id) {

        this.id = id;
    }

    /**
     * ID_残業日_プロジェクトIDを取得する。
     *
     * @return ID_残業日_プロジェクトID
     */
    public String getId() {

        return id;
    }

    /**
     * 残業日を設定する。
     *
     */
    public void setTargetDate(String targetDate) {

        this.targetDate = targetDate;
    }

    /**
     * 残業日を取得する。
     *
     * @return 残業日
     */
    public String getTargetDate() {

        return targetDate;
    }

    /**
     * 残業時間を設定する。
     *
     * @param time 残業時間
     */
    public void setTime(double time) {

        this.time = time;
    }

    /**
     * 残業時間を取得する。
     *
     * @return 残業時間
     */
    public double getTime() {

        return time;
    }

    /**
     * プロジェクトIDを設定する。
     *
     * @param projectId プロジェクトID
     */
    public void setProjectId(String projectId) {

        this.projectId = projectId;
    }

    /**
     * プロジェクトIDを取得する。
     *
     * @return プロジェクトID
     */
    public String getProjectId() {

        return projectId;
    }

    /**
     * プロジェクト名を設定する。
     *
     * @param projectName プロジェクト名
     */
    public void setProjectName(String projectName) {

        this.projectName = projectName;
    }

    /**
     * プロジェクト名を取得する。
     *
     * @return プロジェクト名
     */
    public String getProjectName() {

        return projectName;
    }

    /**
     * 申請状態を設定する。
     *
     * @param statusApply 申請状態
     */
    public void setStatusApply(boolean statusApply) {

        this.statusApply = statusApply;
    }

    /**
     * 申請状態を取得する。
     *
     * @return 申請状態
     */
    public boolean getStatusApply() {

        return statusApply;
    }

    /**
     * PM承認状態を設定する。
     *
     * @param statusPmApprove PM承認状態
     */
    public void setStatusPmApprove(Boolean statusPmApprove) {

        this.statusPmApprove = statusPmApprove;
    }

    /**
     * PM承認状態を取得する。
     *
     * @return PM承認状態
     */
    public Boolean getStatusPmApprove() {

        return statusPmApprove;
    }

    /**
     * DM承認状態を設定する。
     *
     * @param statusDmApprove DM承認状態
     */
    public void setStatusDmApprove(Boolean statusDmApprove) {

        this.statusDmApprove = statusDmApprove;
    }

    /**
     * DM承認状態を取得する。
     *
     * @return DM承認状態
     */
    public Boolean getStatusDmApprove() {

        return statusDmApprove;
    }

    /**
     * 残業理由を設定する。
     *
     * @param comment 残業理由
     */
    public void setComment(String comment) {

        this.comment = comment;
    }

    /**
     * 残業理由を取得する。
     *
     * @return 残業理由
     */
    public String getComment() {

        return comment;
    }

    /**
     * ユーザ名を設定する。
     *
     * @param userName ユーザ名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ユーザ名を取得する。
     *
     * @return ユーザ名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 主管PMを設定する。
     *
     * @param pmName 主管PM
     */
    public String getPmName() {
        return pmName;
    }

    /**
     * 主管PMを取得する。
     *
     * @return 主管PM
     */
    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

}
