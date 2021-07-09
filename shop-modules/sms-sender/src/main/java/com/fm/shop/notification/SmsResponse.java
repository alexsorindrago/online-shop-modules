package com.fm.shop.notification;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SmsResponse {

    private Data data;

    public SmsResponse() {
    }

    public SmsResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SmsResponse{" +
                "data=" + data +
                '}';
    }

}
