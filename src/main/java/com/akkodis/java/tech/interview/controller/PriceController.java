package com.akkodis.java.tech.interview.controller;

import com.akkodis.java.tech.interview.dto.PriceDTO;
import com.akkodis.java.tech.interview.model.PriceEntity;
import com.akkodis.java.tech.interview.service.PriceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<PriceDTO> getPriceByDateAndProductAndBrand(
            @RequestParam String date,
            @RequestParam Long productId,
            @RequestParam Long brandId
    ) {
        PriceDTO priceDTO = convertToDto(this.priceService.getPriceByDateAndProductAndBrand(date, productId, brandId).orElse(null));
        return new ResponseEntity<>(priceDTO, HttpStatus.OK);
    }

    private PriceDTO convertToDto(PriceEntity priceEntity) {
        if (priceEntity != null) {
            return modelMapper.map(priceEntity, PriceDTO.class);
        }
        return null;
    }


}
