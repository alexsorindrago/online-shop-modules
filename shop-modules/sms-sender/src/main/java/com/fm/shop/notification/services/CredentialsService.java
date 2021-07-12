package com.fm.shop.notification.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fm.shop.notification.logins.Credentials;

import java.io.File;
import java.io.IOException;

public class CredentialsService {

    Credentials createObject(String filePath) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        try {
            return mapper.readValue(new File(filePath), Credentials.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
