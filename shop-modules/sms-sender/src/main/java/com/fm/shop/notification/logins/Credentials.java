package com.fm.shop.notification.logins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Credentials {
    private String appId;
    private String appToken;

    public Credentials() {
    }

    public Credentials(String appId, String appToken) {
        this.appId = appId;
        this.appToken = appToken;
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
}
