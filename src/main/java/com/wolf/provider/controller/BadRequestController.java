package com.wolf.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadRequestController {
    Logger logger = LoggerFactory.getLogger(BadRequestController.class);

    @GetMapping("/bad")
    public String hello() {
        logger.info("provider invoked :bad request");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("thread sleep method exception ", e);
        }
        return "bad, ztax";
    }
}
