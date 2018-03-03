package com.microservice.email.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @GetMapping(path="/test-email")
    public String testEmail(){
        return "Success";
    }
}
