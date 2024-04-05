package com.sureshb.clusus.fxdealservice.repository;

import com.sureshb.clusus.fxdealservice.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends JpaRepository<Deal, Integer> {
    Boolean existsDealByDealId(int dealId);
}
