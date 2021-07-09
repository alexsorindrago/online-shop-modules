package com.fm.shop.notification;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class SmsService {

    public static final String URL = "https://portal.bulkgate.com/api/1.0/simple/transactional";
    public static final String MOCK_URL = "https://httpbin.org/post";

    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    void sendSms() {

        //get credentials - hardcode

        // send a request - post to api
        SmsRequest newRequest = new SmsRequest("appIdString", "appToken", "40723698005", "works?");
        //send request to https://portal.bulkgate.com/api/1.0/simple/transactional "
        String json = ""; // TODO: convert request into this json use Jackson Object Mapper
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create(MOCK_URL))
                .header("Content-Type", "application/json")
                .header("Cache-Control", "no-cache")
                .build();

        // get a response
        try {
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            //TODO: convert json into java Object (smsResponse) with jacson
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
