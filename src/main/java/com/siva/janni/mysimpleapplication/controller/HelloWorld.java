package com.siva.janni.mysimpleapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/wish")
    public String wish() {
        return "Hello World!!";
    }

    @GetMapping("/message")
    public String message() {
        return "Boss is back";
    }
}
