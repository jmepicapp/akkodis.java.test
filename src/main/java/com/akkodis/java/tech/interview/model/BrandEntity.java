package com.akkodis.java.tech.interview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "BRANDS")
@Getter
public class BrandEntity {

    @Id
    private Long id;
    private String name;
}
