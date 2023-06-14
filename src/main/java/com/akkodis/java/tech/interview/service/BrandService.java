package com.akkodis.java.tech.interview.service;

import com.akkodis.java.tech.interview.model.BrandEntity;

import java.util.Optional;

public interface BrandService {
    Optional<BrandEntity> getBrand(Long brandId);
}
