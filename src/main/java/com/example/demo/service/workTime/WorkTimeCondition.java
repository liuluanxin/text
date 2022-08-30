package com.example.demo.service.workTime;

public class WorkTimeCondition {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;
    
    /** the user id */
    private String userId;

    /** the project id */
    private String projectId;
    
    /** the year */
    private String year;

    /** the month */
    private String month;

    /** the management user id */
    private String managerUserId;

    /** the target date */
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
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
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
