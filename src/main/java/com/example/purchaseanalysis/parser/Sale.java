package com.example.purchaseanalysis.parser;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "sale")
public class Sale {

    private int card_number;
    private int data;
    private List<Products> products = new ArrayList<>();

    @XmlElement(name = "card_number")
    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    @XmlElement(name = "data")
    public void setData(int data) {
        this.data = data;
    }

    @XmlElement(name = "products")
    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getCard_number() {
        return card_number;
    }

    public int getData() {
        return data;
    }

    public List<Products> getProducts() {
        return products;
    }
}
