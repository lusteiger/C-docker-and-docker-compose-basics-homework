package com.thoughtworks.capability.gtb.bob.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobController {
    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    String getHello(){
        return "Hello from Bob!";
    }
}