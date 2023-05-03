package com.shipment.logistic.service;

import com.shipment.logistic.domain.Logistic;

import java.util.List;

public interface LogisticService {

    Logistic findById(Long id);

    List<Logistic> getAll();

    void saveOrUpdate(Logistic logistic);
}
