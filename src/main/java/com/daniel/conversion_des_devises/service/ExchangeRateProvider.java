package com.daniel.conversion_des_devises.service;


import reactor.core.publisher.Mono;

/**
 * Interface définissant le contrat pour la récupération des taux de change.
 * Permet de changer facilement la source des taux de change (API externe, base de données, etc.).
 */
public interface ExchangeRateProvider {
    Mono<Double> getConversionRate(String baseCurrency, String targetCurrency);
}
