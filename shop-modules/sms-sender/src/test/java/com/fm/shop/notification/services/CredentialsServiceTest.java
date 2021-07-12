package com.fm.shop.notification.services;

import com.fm.shop.notification.logins.Credentials;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CredentialsServiceTest {

    CredentialsService credentialsService = new CredentialsService();

    @Test
    void givenYmlFile_whenBuildObject_thenObjectIsBuilt() {
        //TODO: build test for yml loading

        //given yml path and object
        Credentials credentials;
        String filePath = "src/main/resources/credentialsData.yml";

        //when
        credentials = credentialsService.createObject(filePath);

        //then
        assertThat(credentials.getAppId()).isEqualTo("21844");

    }

}