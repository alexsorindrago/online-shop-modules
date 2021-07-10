package com.fm.shop.notification;

public class SmsSenderApplication {

    public static void main(String[] args) {
        System.out.println("hello sms sender");

        SmsService smsService = new SmsService();
        smsService.sendSms("40723698005", "fraierii sa taca scriem zi de zi pe foaie. pentru ca totul in cartier se bazeaza pe coaie");
    }
}
