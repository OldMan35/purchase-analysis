package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

public class Products {

    List<Product> product = new ArrayList<>();

    public List<Product> getProduct() {
        return product;
    }

    @XmlElement(name = "product")
    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
