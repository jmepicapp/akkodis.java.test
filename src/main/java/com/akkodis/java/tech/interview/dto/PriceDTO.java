package com.akkodis.java.tech.interview.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class PriceDTO {
    private Long productId;

    private Long brandId;

    private String priceList;

    @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    private String startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
    private String endDate;

    private double price;

    private String currency;

}
