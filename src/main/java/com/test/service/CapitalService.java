package com.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapitalService {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());



    @GetMapping(path = "/capital")
    public String getCapital() {
        LOGGER.info("CapitalService.getCapital() called");
        return "Helsinki";
    }

    @GetMapping(path = "/capitalDone")
    public String getCapitalDone() {
        LOGGER.info("CapitalService.getCapitalDone() called");
        return "Helsinki-Done";
    }

    @GetMapping(path = "/capitalFailed")
    public String capitalFailed() {
        LOGGER.error("CapitalService.capitalFailed() called");
        return "Helsinki-Failed";
    }

    @GetMapping(path = "/capitalwarn")
    public String capitalWarn() {
        LOGGER.warn("CapitalService.capitalWarn() called");
        return "Helsinki-WARN";
    }

}
