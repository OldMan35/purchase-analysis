package com.example.purchaseanalysis.parser;

import lombok.*;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SALE", propOrder = {"card_number",
        "data", "products"})
public class Sale {

    @XmlElement(required = true)
    private int card_number;

    @XmlElement(required = true)
    private int data;

    @XmlElement(required = true)
    private Products products = new Products();

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @XmlRootElement
    @XmlType(name = "PRODUCTS")
    public static class Products {
        private int product_code;
        private String name;
        private BigDecimal price;
        private int count;
    }
}

