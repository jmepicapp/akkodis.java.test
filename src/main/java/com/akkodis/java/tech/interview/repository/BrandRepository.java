package com.akkodis.java.tech.interview.repository;

import com.akkodis.java.tech.interview.model.BrandEntity;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<BrandEntity, Long> {
}
