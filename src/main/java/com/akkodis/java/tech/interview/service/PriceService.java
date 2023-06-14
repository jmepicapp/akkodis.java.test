package com.akkodis.java.tech.interview.service;

import com.akkodis.java.tech.interview.model.PriceEntity;

import java.util.Optional;

public interface PriceService {
    Optional<PriceEntity> getPriceByDateAndProductAndBrand(String date, Long productId, Long brandId);
}
