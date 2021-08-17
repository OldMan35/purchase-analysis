package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlElement(name="PRODUCT_CODE")
    private Integer product_code;

    @XmlElement(name="NAME")
    private String name;

    @XmlElement(name="PRICE")
    private BigDecimal price;

    @XmlElement(name="COUNT")
    private Integer count;

    public Product() {
    }

    public Product(Integer product_code, String name, BigDecimal price, Integer count) {
        this.product_code = product_code;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Integer getProduct_code() {
        return product_code;
    }

    public void setProduct_code(Integer product_code) {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
