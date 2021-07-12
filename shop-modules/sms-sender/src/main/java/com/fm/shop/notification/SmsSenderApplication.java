package com.fm.shop.notification;

import com.fm.shop.notification.services.SmsService;

public class SmsSenderApplication {

    public static void main(String[] args) {
        System.out.println("hello sms sender");

        SmsService smsService = new SmsService();
        smsService.sendSms("40723698005", "testing 1.2.3.");
    }
}
