package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "sales")
public class Sales {

    private List<Sale> sale = new ArrayList<>();

    @XmlElement(name = "sale")
    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }

    public List<Sale> getSale() {
        return sale;
    }
}

