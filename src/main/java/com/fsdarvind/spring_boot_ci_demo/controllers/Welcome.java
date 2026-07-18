package com.fsdarvind.spring_boot_ci_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String greetings(){
        return "Hi!! Welcome from CI/CD pipeline....";
    }

}
