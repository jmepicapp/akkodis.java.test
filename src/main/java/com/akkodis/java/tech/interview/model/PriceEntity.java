package com.akkodis.java.tech.interview.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
@Data
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    private BrandEntity brand;

    @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    private LocalDateTime startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    private LocalDateTime endDate;

    private String priceList;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    private int priority;

    @Column(scale = 2)
    private double price;

    private String currency;

}
