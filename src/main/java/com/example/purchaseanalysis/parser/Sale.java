package com.example.purchaseanalysis.parser;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "SALE")
@XmlType(propOrder = {"card_number", "data", "products"})
public class Sale {


    private int card_number;

    private int data;

    private List<Sales.Products> products = new ArrayList<>();

}
