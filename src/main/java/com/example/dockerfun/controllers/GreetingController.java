package com.example.dockerfun.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping(value="/")
    public static String Greeting() {
        return "Hello from DockerFun! Are you having fun?";
    }
}
