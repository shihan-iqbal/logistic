package com.shipment.logistic.service.impl;

import com.shipment.logistic.domain.Logistic;
import com.shipment.logistic.repository.LogisticsRepository;
import com.shipment.logistic.service.LogisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class LogisticServiceImpl implements LogisticService {

    @Autowired
    private LogisticsRepository logisticsRepository;

    @Override
    public Logistic findById(Long id) {
        return logisticsRepository.findById(id).get();
    }

    @Override
    public List<Logistic> getAll() {
        return logisticsRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Logistic logistic) {
        logisticsRepository.save(logistic);
    }
}
