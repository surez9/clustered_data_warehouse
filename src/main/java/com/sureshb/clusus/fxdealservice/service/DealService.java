package com.sureshb.clusus.fxdealservice.service;

import com.sureshb.clusus.fxdealservice.dto.DealRequestDto;
import com.sureshb.clusus.fxdealservice.model.Deal;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DealService {
    List<Deal> getAllFxDeals();

    ResponseEntity<String> addDeal(DealRequestDto dealRequestDto);
}
