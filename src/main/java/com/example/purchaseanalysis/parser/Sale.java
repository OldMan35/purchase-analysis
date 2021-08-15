package com.example.purchaseanalysis.parser;

import lombok.*;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SALE", propOrder = {"CARD_NUMBER",
        "DATA", "PRODUCTS"})
public class Sale {

    @XmlElement(required = true)
    private int CARD_NUMBER;

    @XmlElement(required = true)
    private int DATA;

    @XmlElement(required = true)
    private Products PRODUCTS = new Products();

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @XmlRootElement
    @XmlType(name = "PRODUCTS", propOrder = {"PRODUCT_CODE",
            "NAME", "PRICE", "COUNT"})
    public static class Products {
        private int PRODUCT_CODE;
        private String NAME;
        private BigDecimal PRICE;
        private int COUNT;

    }


}
