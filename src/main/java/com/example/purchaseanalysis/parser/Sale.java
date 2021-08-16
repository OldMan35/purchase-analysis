package com.example.purchaseanalysis.parser;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(name = "SALE", propOrder = {"card_number", "data", "products"})
public class Sale {

    private int card_number;
    private int data;
    @XmlAnyElement
    private List<Products> products = new ArrayList<>();

    public Sale() {
    }

    public Sale(int card_number, int data, List<Products> products) {
        this.card_number = card_number;
        this.data = data;
        this.products = products;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public void setData(int data) {
        this.data = data;
    }

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
