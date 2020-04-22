package com.centime.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public Object hello(String logId) {
        logger.info("hello controller called with logID: {}", logId);
        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }
}
