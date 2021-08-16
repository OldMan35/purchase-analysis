package com.example.purchaseanalysis.parser;


import javax.xml.bind.annotation.*;
import java.math.BigDecimal;

@XmlRootElement(name = "PRODUCT")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"product_code", "name", "price", "count"})
public class Product {

    @XmlElement(required = true)
    private int product_code;
    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private BigDecimal price;
    @XmlElement(required = true)
    private int count;

}
