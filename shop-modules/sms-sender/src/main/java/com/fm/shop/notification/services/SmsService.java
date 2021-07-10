package com.fm.shop.notification.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fm.shop.notification.requests.SmsRequest;
import com.fm.shop.notification.responses.SmsResponse;

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

    //TODO: store in YML, read from YML and use in send method
    private final String appId = "21844";
    private final String appToken = "EGqd40WStovFNcgAREqIbNjTz4GlEklvUGDjues3zXFj0Zj0ct";


    public SmsResponse sendSms(String phoneNumber, String message) {

        SmsRequest smsRequest = new SmsRequest(appId, appToken, phoneNumber, message);

        // convert request into json use Jackson Object Mapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String json = "";

        try {
            json = mapper.writeValueAsString(smsRequest);
            System.out.println(json); //check not null json
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // build the request
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create(MOCK_URL))
                .header("Content-Type", "application/json")
                .header("Cache-Control", "no-cache")
                .build();

        // send request and get a response
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response); // check send and status code

            // status codes from documentation, verify if response is successful
            if (response.statusCode() == 200) {
                System.out.println(response.body());
                return mapper.readValue(response.body(), SmsResponse.class);
            } else {
                System.out.println(response.body());
                return null;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

}
