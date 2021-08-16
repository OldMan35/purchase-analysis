package com.example.purchaseanalysis.parser;


import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement
@XmlType(name = "PRODUCT", propOrder = {"product_code", "name", "price", "count"})
public class Product {

    private int product_code;

    private String name;

    private BigDecimal price;

    private int count;

    public Product() {
    }

    public Product(int product_code, String name, BigDecimal price, int count) {
        this.product_code = product_code;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getProduct_code() {
        return product_code;
    }


    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
