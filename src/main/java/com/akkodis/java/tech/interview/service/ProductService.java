package com.akkodis.java.tech.interview.service;

import com.akkodis.java.tech.interview.model.ProductEntity;

import java.util.Optional;

public interface ProductService {

    Optional<ProductEntity> getProduct(Long productId);
}
