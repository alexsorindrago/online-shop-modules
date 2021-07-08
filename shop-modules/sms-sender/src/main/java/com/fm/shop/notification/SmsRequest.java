package com.fm.shop.notification;

public class SmsRequest {

    private String appId;
    private String appToken;
    private String phoneNumber;
    private String message;

    public SmsRequest() {
    }

    public SmsRequest(String appId, String appToken, String phoneNumber, String message) {
        this.appId = appId;
        this.appToken = appToken;
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
