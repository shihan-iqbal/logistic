package com.shipment.logistic.controller;


import com.shipment.logistic.domain.Logistic;
import com.shipment.logistic.service.LogisticService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Objects.nonNull;


@RestController
@RequestMapping(value = "/v1/api/logistic")
@Slf4j
public class LogisticsRestController {

    @Autowired
    private LogisticService logisticService;

    @RequestMapping(value = "/{logisticId}", method = RequestMethod.GET)
    public ResponseEntity<Logistic> getLogisticById(@PathVariable Long logisticId) {
        return  ResponseEntity.ok(logisticService.findById(logisticId));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Logistic>> getLogistics() {
        return  ResponseEntity.ok(logisticService.getAll());
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> saveLogistic(@RequestBody Logistic logistic, @PathVariable(name = "id", required = false) Long logisticId) {
        if (nonNull(logistic)) {
           logistic.setId(logisticId);
        }
        logisticService.saveOrUpdate(logistic);
        return  ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
    }

    @RequestMapping(value = "/status/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> statusUpdate(@RequestBody Logistic logistic, @PathVariable Long logisticId) {
        logistic.setId(logisticId);
        logisticService.saveOrUpdate(logistic);
        return  ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
    }

}
