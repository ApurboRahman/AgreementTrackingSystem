package com.ats.helper;

import java.util.Date;

/**
 * Created by md.rahman on 11/18/2017.
 */
public class CurrentUser {
    private String userId;
    private String userName;
    private Date loggedOn;
    private String branchCode;
    private String branchName;
    private Date systemOpenDate;
    private Date serverDate;
    private Integer notification;
    private String screenId;
    private Boolean isDayOpen;


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

    public Date getLoggedOn() {
        return loggedOn;
    }

    public void setLoggedOn(Date loggedOn) {
        this.loggedOn = loggedOn;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Date getSystemOpenDate() {
        return systemOpenDate;
    }

    public void setSystemOpenDate(Date systemOpenDate) {
        this.systemOpenDate = systemOpenDate;
    }

    public Date getServerDate() {
        return serverDate;
    }

    public void setServerDate(Date serverDate) {
        this.serverDate = serverDate;
    }

    public Integer getNotification() {
        return notification;
    }

    public void setNotification(Integer notification) {
        this.notification = notification;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public Boolean getIsDayOpen() {
        return isDayOpen;
    }

    public void setIsDayOpen(Boolean isDayOpen) {
        this.isDayOpen = isDayOpen;
    }
}
