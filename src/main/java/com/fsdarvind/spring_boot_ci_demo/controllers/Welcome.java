package com.fsdarvind.spring_boot_ci_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String greetings(){
        return "This project is deployed using Github actions!!!";
    }

}
