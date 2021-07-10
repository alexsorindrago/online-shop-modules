package com.fm.shop.notification;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsRequest {

    @JsonProperty("application_id")
    private String appId;
    @JsonProperty("application_token")
    private String appToken;
    @JsonProperty("number")
    private String phoneNumber;
    @JsonProperty("text")
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

    @Override
    public String toString() {
        return "SmsRequest{" +
                "appId='" + appId + '\'' +
                ", appToken='" + appToken + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
