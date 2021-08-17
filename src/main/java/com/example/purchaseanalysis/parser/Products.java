package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement(name = "PRODUCTS")
public class Products {

    private Integer product_code;
    private String name;
    private BigDecimal price;
    private Integer count;

    public Integer getProduct_code() {
        return product_code;
    }
    @XmlElement(name = "PRODUCT_CODE")
    public void setProduct_code(Integer product_code) {
        this.product_code = product_code;
    }

    public String getName() {
        return name;
    }
    @XmlElement(name = "NAME")
    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }
    @XmlElement(name = "PRICE")
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

