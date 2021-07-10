package com.fm.shop.notification;

import com.fm.shop.notification.responses.Data;
import com.fm.shop.notification.services.SmsService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmsServiceTest {

    SmsService smsService;

    Data data;

    //TODO: build this test
    @Test
    void givenPhoneNumberAndMessage_whenSend_getResponse() {
        //given
        String phoneNumber = "4723698005";
        String message = "works? sent from Java by Alex";

        String expectedStatus = "accepted";

        //when
        smsService.sendSms(phoneNumber, message);

        //then
        assertThat(expectedStatus).isEqualTo(data.getStatus());


    }

}