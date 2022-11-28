package com.densoft.springjekins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String sayHello() {
        return "hello jenkins";
    }


    @GetMapping
    public String sayHelloPeople() {
        return "hello devs";
    }
}
