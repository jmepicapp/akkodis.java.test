package com.akkodis.java.tech.interview.service.impl;

import com.akkodis.java.tech.interview.exception.BrandNotFoundException;
import com.akkodis.java.tech.interview.model.BrandEntity;
import com.akkodis.java.tech.interview.repository.BrandRepository;
import com.akkodis.java.tech.interview.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Optional<BrandEntity> getBrand(Long brandId) {
        return Optional.ofNullable(this.brandRepository.findById(brandId).orElseThrow(() -> new BrandNotFoundException("The brand doesn't exist")));
    }
}
