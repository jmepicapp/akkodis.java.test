package com.akkodis.java.tech.interview.repository;

import com.akkodis.java.tech.interview.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
