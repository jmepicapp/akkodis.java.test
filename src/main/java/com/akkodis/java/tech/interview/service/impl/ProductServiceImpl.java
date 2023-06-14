package com.akkodis.java.tech.interview.service.impl;

import com.akkodis.java.tech.interview.exception.BrandNotFoundException;
import com.akkodis.java.tech.interview.model.ProductEntity;
import com.akkodis.java.tech.interview.repository.ProductRepository;
import com.akkodis.java.tech.interview.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Optional<ProductEntity> getProduct(Long productId) {
        return Optional.ofNullable(this.productRepository.findById(productId).orElseThrow(() -> new BrandNotFoundException("The product doesn't exist")));
    }
}
