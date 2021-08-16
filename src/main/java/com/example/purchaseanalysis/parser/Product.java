package com.example.purchaseanalysis.parser;


import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement(name = "PRODUCT")
public class Product {

    private int product_code;

    private String name;

    private BigDecimal price;

    private int count;

    public int getProduct_code() {
        return product_code;
    }
    @XmlElement(name = "product_code")
    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public String getName() {
        return name;
    }
    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }
    @XmlElement(name = "price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }
    @XmlElement(name = "count")
    public void setCount(int count) {
        this.count = count;
    }
}
