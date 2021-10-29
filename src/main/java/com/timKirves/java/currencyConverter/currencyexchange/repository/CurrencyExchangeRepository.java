package com.timKirves.java.currencyConverter.currencyexchange.repository;

import com.timKirves.java.currencyConverter.currencyexchange.entity.CurrencyExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeEntity, Long> {
}
