package com.akkodis.java.tech.interview.repository;

import com.akkodis.java.tech.interview.model.PriceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PriceRepository extends CrudRepository<PriceEntity, Long> {
    @Query("SELECT p FROM PriceEntity p WHERE " +
            "(:date BETWEEN p.startDate AND p.endDate) " +
            "AND product.id = :productId " +
            "AND brand.id = :brandId " +
            "ORDER BY p.priority DESC LIMIT 1")
    PriceEntity findByProductAndBrandId(LocalDateTime date, Long productId, Long brandId);
}
