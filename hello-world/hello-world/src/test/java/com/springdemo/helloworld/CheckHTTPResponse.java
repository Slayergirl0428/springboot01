package com.springdemo.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;
    
    @Test
    public void shouldPassifStringMatches() {
     assertEquals("Hello world from Spring Boot", 
             testRestTemplate.getForObject("http;//localhost;"+ port + "/",
                     String.class));
    }

    private void assertEquals(String helloWorldFromSpringBoot, String forObject) {
    }
}
