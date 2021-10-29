package com.timKirves.java.currencyConverter.currencyexchange.service;

import com.timKirves.java.currencyConverter.currencyexchange.entity.CurrencyExchangeEntity;
import com.timKirves.java.currencyConverter.currencyexchange.repository.CurrencyExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@RequiredArgsConstructor
public class CurrencyExchangeService {
    private final CurrencyExchangeRepository currencyExchangeRepository;

    public List<CurrencyExchangeEntity> getCurrencyExchanges() {
        return currencyExchangeRepository.findAll();
    }

    public CurrencyExchangeEntity getCurrency(Long id) {
        return currencyExchangeRepository.findById(id).orElseThrow(() -> new RuntimeException("Currency with this ID not found"));
    }
}
