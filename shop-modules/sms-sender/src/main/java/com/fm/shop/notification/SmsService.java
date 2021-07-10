package com.fm.shop.notification;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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

        String json = null;

        try {
            json = mapper.writeValueAsString(smsRequest);
            System.out.println(json); //check not null json
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .uri(URI.create(URL))
                .header("Content-Type", "application/json")
                .header("Cache-Control", "no-cache")
                .build();

        // get a response
        HttpResponse<String> response;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response); // check send and status code
            // status codes from documentation, verify if response is successful
            if (response.statusCode() == 200) {
                SmsResponse smsResponse;
                smsResponse = mapper.readValue(response.body(), SmsResponse.class);
                System.out.println(smsResponse);
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
