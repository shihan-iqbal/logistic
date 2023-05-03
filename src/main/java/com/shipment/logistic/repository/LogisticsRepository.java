package com.shipment.logistic.repository;

import com.shipment.logistic.domain.Logistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticsRepository extends JpaRepository<Logistic, Long> {

}
