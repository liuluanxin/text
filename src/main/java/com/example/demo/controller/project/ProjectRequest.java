package com.example.demo.controller.project;

import java.io.Serializable;

public class ProjectRequest implements Serializable {

    /**
     * 用户ID
     */
    public String userId;

    /**
     * 用户IDを設定する。
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {

        this.userId = userId;
    }

    /**
     * 用户IDを取得する。
     *
     * @return 用户ID
     */
    public String getUserId() {

        return userId;
    }
}
