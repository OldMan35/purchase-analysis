package com.example.purchaseanalysis.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class SaleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int card_number;

    private int data;

    private int product_code;

    private String name;

    private BigDecimal price;

    private int count;

}
