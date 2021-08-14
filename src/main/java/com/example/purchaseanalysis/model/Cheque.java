package com.example.purchaseanalysis.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cheque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int cardNumber;

    private int dataCheque;

    private String purchase;

    private int articleNumber;

    private String productName;

    private int quantityProduct;

    private BigDecimal costGoods;
}
