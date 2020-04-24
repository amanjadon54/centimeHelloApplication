package com.centime.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public Object hello(@RequestHeader Map<String, String> headers, String logId) {
        logger.info("hello controller called with logID: {}", logId);
        throw new RuntimeException();
//        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }
}
