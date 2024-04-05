package com.sureshb.clusus.fxdealservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "deal")
@Data
@Builder
public class Deal {

    @Id
    @Column(name = "deal_id",nullable = false,unique = true)
    private int dealId;

    @Column(name = "from_currency")
    private String fromCurrency;

    @Column(name = "toCurrency")
    private String toCurrency;

    @Column(name = "time")
    private Date time;

    @Column(name = "deal_amount")
    private BigDecimal dealAmount;
}
