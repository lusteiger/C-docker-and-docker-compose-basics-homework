package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class AliceController {

    public String HelloFromBobUrl = "http://bob:8081/hello";

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    String getHelloFromBob() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(HelloFromBobUrl, String.class);
        return response.getBody();
    }
}
