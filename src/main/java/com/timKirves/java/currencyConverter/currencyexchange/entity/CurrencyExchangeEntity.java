package com.timKirves.java.currencyConverter.currencyexchange.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchangeEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String currency;
    private double rate;
}
