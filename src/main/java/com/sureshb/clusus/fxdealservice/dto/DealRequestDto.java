package com.sureshb.clusus.fxdealservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DealRequestDto {
    private int dealId;
    private String fromCurrency;
    private String toCurrency;
    private Date time;
    private BigDecimal dealAmount;
}
