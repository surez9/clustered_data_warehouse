package com.sureshb.clusus.fxdealservice.controller;

import com.sureshb.clusus.fxdealservice.dto.DealRequestDto;
import com.sureshb.clusus.fxdealservice.model.Deal;
import com.sureshb.clusus.fxdealservice.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/fx")
public class DealController {

    private DealService dealService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Deal>> getFxDeals() {
        List<Deal> deals = dealService.getAllFxDeals();
        return new ResponseEntity<>(deals, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addDeal(@RequestBody DealRequestDto dealRequestDto) {
        return dealService.addDeal(dealRequestDto);
    }
}
