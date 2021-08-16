package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRODUCTS")
public class Products {

    @XmlElement(required = true)

    List<Product> product = new ArrayList<>();

    public Products() {
    }

    public Products(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    @XmlElement(name = "product")
    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
