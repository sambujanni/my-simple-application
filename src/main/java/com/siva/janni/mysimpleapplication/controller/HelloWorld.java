package com.siva.janni.mysimpleapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping
    public String wish() {
        return "Hello World!!";
    }
}