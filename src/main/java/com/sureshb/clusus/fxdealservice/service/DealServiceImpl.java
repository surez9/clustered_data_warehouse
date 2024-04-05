package com.sureshb.clusus.fxdealservice.service;

import com.sureshb.clusus.fxdealservice.dto.DealRequestDto;
import com.sureshb.clusus.fxdealservice.model.Deal;
import com.sureshb.clusus.fxdealservice.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealServiceImpl implements  DealService{

    private final DealRepository dealRepository;

    private DealServiceImpl(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @Override
    public List<Deal> getAllFxDeals() {
        return dealRepository.findAll();
    }

    @Override
    public ResponseEntity<String> addDeal(DealRequestDto dealRequestDto) {
        if (!findDeal(dealRequestDto.getDealId())) {
            Deal dealToBeAdded = Deal.builder()
                    .dealId(dealRequestDto.getDealId())
                    .toCurrency(dealRequestDto.getToCurrency())
                    .fromCurrency(dealRequestDto.getFromCurrency())
                    .dealAmount(dealRequestDto.getDealAmount())
                    .build();
            dealRepository.save(dealToBeAdded);
            return new ResponseEntity<>("The deal is added", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("The deal already exists",HttpStatus.IM_USED);
        }
    }

    private boolean findDeal(int dealId){
        return dealRepository.existsDealByDealId(dealId);
    }
}
