package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Sale {

    @XmlElement(name = "CARD_NUMBER")
    private Integer card_number;

    @XmlElement(name = "DATE")
    private Long date;

    @XmlElementWrapper(name="SALE")
    @XmlElement(name="PRODUCT")
    private List<Product> products;

    public Sale() {
    }

    public Sale(Integer card_number, Long date, List<Product> products) {
        this.card_number = card_number;
        this.date = date;
        this.products = products;
    }

    public Integer getCard_number() {
        return card_number;
    }

    public void setCard_number(Integer card_number) {
        this.card_number = card_number;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
