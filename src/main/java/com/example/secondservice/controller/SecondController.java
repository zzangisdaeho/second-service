package com.example.secondservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SecondController {

    @GetMapping("/welcome")
    public String hello(){
        return "second service";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header){
        System.out.println(header);
        log.info(header);
        return "Hello in Second Service.";
    }

    @GetMapping("/check")
    public String check(){
        return "second check";
    }
}
