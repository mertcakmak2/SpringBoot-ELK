package com.spring.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
@Slf4j
public class LogController {

    @GetMapping
    public ResponseEntity<String> logging() {

        log.info("{} logging", "/api/log method");

        return new ResponseEntity<String>("logging method", HttpStatus.OK);
    }

}
