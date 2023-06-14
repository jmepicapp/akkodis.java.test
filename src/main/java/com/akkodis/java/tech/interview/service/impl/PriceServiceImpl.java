package com.akkodis.java.tech.interview.service.impl;

import com.akkodis.java.tech.interview.model.PriceEntity;
import com.akkodis.java.tech.interview.repository.PriceRepository;
import com.akkodis.java.tech.interview.service.BrandService;
import com.akkodis.java.tech.interview.service.PriceService;
import com.akkodis.java.tech.interview.service.ProductService;
import com.akkodis.java.tech.interview.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;
    @Autowired
    private BrandService brandService;
    @Autowired
    private ProductService productService;

    @Override
    public Optional<PriceEntity> getPriceByDateAndProductAndBrand(String date, Long productId, Long brandId) {
        if (this.brandService.getBrand(brandId).isPresent() && this.productService.getProduct(productId).isPresent()) {
            LocalDateTime localDateTime = DateUtil.convertToLocalDateTime(date);
            return Optional.ofNullable(this.priceRepository.findByProductAndBrandId(localDateTime, productId, brandId));
        } else {
            return Optional.empty();
        }
    }
}
