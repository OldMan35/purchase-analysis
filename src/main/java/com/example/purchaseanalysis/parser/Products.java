package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "PRODUCTS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {

        List<Sales.Product> product = new ArrayList<>();

}
