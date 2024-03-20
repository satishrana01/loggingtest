package com.test.controller;

import com.test.reservation.CommonEngineService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationServiceController {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Qualifier("FNDEngineImpl")
    @Autowired
    private CommonEngineService fndService;

    @Qualifier("FTSEngineImpl")
    @Autowired
    private CommonEngineService ftsService;

    @GetMapping(path = "/reservation",produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getEngineBean(){

        var fndModel = fndService.createReservation(null);
        LOGGER.info(fndModel.getEngineName());

        var ftsModel = ftsService.makeReservation(null);

        LOGGER.info(ftsModel.getEngineName());

        return "success";
    }

    @GetMapping(path = "/reservationfailed",produces = {MediaType.APPLICATION_JSON_VALUE})
    public String reservationFailed(){

        LOGGER.error("Failed reservation request");

        return "Failed";
    }
}
