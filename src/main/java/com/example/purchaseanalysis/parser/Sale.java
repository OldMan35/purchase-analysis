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
    private List<Products> products = new ArrayList<>();

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @XmlRootElement
    @XmlType(name = "PRODUCTS")
    public static class Products {
        List<Product> product = new ArrayList<>();

    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @XmlRootElement
    @XmlType(name = "PRODUCT", propOrder = {"product_code",
            "name", "price", "count"})
    public static class Product {
        @XmlElement(required = true)
        private int product_code;
        @XmlElement(required = true)
        private String name;
        @XmlElement(required = true)
        private BigDecimal price;
        @XmlElement(required = true)
        private int count;
    }
}

