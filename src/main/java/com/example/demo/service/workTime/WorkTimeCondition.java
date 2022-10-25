package com.example.demo.service.workTime;

public class WorkTimeCondition {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * the user id
     */
    private String userId;

    /**
     * the project id
     */
    private String projectId;

    /**
     * the year
     */
    private String day;

    /**
     * the management user id
     */
    private String managerUserId;

    /**
     * the target date
     */
    private String targetDate;

    /**
     * the getter of userId
     *
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * the setter of userId
     *
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * the getter of projectId
     *
     * @return the projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * the setter of projectId
     *
     * @param projectId the projectId to set
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the year to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * the getter of managerUserId
     *
     * @return the managerUserId
     */
    public String getManagerUserId() {
        return managerUserId;
    }

    /**
     * the setter of managerUserId
     *
     * @param managerUserId the managerUserId to set
     */
    public void setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
    }


    /**
     * the getter of targetDate
     *
     * @return the targetDate
     */
    public String getTargetDate() {
        return targetDate;
    }

    /**
     * the setter of targetDate
     *
     * @param targetDate the targetDate to set
     */
    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }
}
