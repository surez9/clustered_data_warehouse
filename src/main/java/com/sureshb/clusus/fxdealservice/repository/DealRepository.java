package com.sureshb.clusus.fxdealservice.repository;

import com.sureshb.clusus.fxdealservice.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal, Integer> {
}
