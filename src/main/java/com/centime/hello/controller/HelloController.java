package com.centime.hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(@RequestHeader Map<String, String> headers, String logId) {
        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }
}
