package com.akkodis.java.tech.interview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "BRANDS")
@Data
public class BrandEntity {

    @Id
    private Long id;
    private String name;
}
