package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "SALES")
public class Sales {

    private int card_number;
    private long date;
    private List<Products> products;

    public List<Products> getProducts() {
        return products;
    }
    @XmlElement(name = "PRODUCTS")
    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getCard_number() {
        return card_number;
    }

    @XmlElement(name = "CARD_NUMBER")
    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public long getDate() {
        return date;
    }

    @XmlElement(name = "DATE")
    public void setDate(long date) {
        this.date = date;
    }

}

