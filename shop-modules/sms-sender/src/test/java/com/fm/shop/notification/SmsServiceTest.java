package com.fm.shop.notification;
import com.fm.shop.notification.responses.SmsResponse;
import com.fm.shop.notification.services.SmsService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SmsServiceTest {

    //DONE: build this test
    @Test
    void givenPhoneNumberAndMessage_whenSend_getResponse() {
        //given
        SmsService smsService = new SmsService();
        SmsResponse response;

        String number = "40723698005";
        String text = "works? sent from Java by Alex";

        String expectedStatus = "accepted";

        //when
        response = smsService.sendSms(number, text);

        //then
        assertThat(expectedStatus).isEqualTo(response.getData().getStatus());
    }

}