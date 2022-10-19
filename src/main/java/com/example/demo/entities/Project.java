package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Project
 *
 * @author xiaojun.lin
 * @version 1.0 2021/08/30 create
 */
public class Project implements Serializable {

    /** the serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** the project_id */
    private String id;

    /** the project_name */
    private String projectName;

    /** the financial_id */
    private String financialId;

    /** the management_user_id */
    private String managementUserId;

    /** the contract_months */
    private Integer contractMonths;

    /** the project_start_date */
    private String projectStartDate;

    /** the project_end_date */
    private String projectEndDate;

    /** the create by */
    private String createBy;

    /** the create at */
    private Date createAt;

    /** the update by */
    private String updateBy;

    /** the update at */
    private Date updateAt;

    /**
     * the getter of id
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * the setter of id
     *
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * the getter of projectName
     *
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * the setter of projectName
     *
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * the getter of financialId
     *
     * @return the financialId
     */
    public String getFinancialId() {
        return financialId;
    }

    /**
     * the setter of financialId
     *
     * @param financialId the financialId to set
     */
    public void setFinancialId(String financialId) {
        this.financialId = financialId;
    }

    /**
     * the getter of managementUserId
     *
     * @return the managementUserId
     */
    public String getManagementUserId() {
        return managementUserId;
    }

    /**
     * the setter of managementUserId
     *
     * @param managementUserId the managementUserId to set
     */
    public void setManagementUserId(String managementUserId) {
        this.managementUserId = managementUserId;
    }

    /**
     * the getter of contractMonths
     *
     * @return the contractMonths
     */
    public Integer getContractMonths() {
        return contractMonths;
    }

    /**
     * the setter of contractMonths
     *
     * @param contractMonths the contractMonths to set
     */
    public void setContractMonths(Integer contractMonths) {
        this.contractMonths = contractMonths;
    }

    /**
     * the getter of projectStartDate
     *
     * @return the projectStartDate
     */
    public String getProjectStartDate() {
        return projectStartDate;
    }

    /**
     * the setter of projectStartDate
     *
     * @param projectStartDate the projectStartDate to set
     */
    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    /**
     * the getter of projectEndDate
     *
     * @return the projectEndDate
     */
    public String getProjectEndDate() {
        return projectEndDate;
    }

    /**
     * the setter of projectEndDate
     *
     * @param projectEndDate the projectEndDate to set
     */
    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    /**
     * the getter of createBy
     *
     * @return the createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * the setter of createBy
     *
     * @param createBy the createBy to set
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * the getter of createAt
     *
     * @return the createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * the setter of createAt
     *
     * @param createAt the createAt to set
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * the getter of updateBy
     *
     * @return the updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * the setter of updateBy
     *
     * @param updateBy the updateBy to set
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * the getter of updateAt
     *
     * @return the updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * the setter of updateAt
     *
     * @param updateAt the updateAt to set
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

}
