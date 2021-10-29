package com.timKirves.java.currencyConverter.currencyexchange.controller;

import com.timKirves.java.currencyConverter.currencyexchange.service.CurrencyExchangeService;
import com.timKirves.java.currencyConverter.currencyexchange.entity.CurrencyExchangeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/getCurrency")
public class CurrencyExchangeController {

    private final CurrencyExchangeService currencyExchangeService;

    @GetMapping
    public List<CurrencyExchangeEntity> getCurrency() {
        return currencyExchangeService.getCurrencyExchanges();
    }

    @GetMapping("/{id}")
    public CurrencyExchangeEntity getCurrency(@PathVariable Long id) {
        return currencyExchangeService.getCurrency(id);
    }

}
