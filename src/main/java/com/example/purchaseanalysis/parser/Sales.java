package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Sales {

    @XmlElement(name = "sale")
    private List<Sale> sale = new ArrayList<>();

    public Sales() {
    }

    public Sales(List<Sale> sale) {
        this.sale = sale;
    }

    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }

    public List<Sale> getSale() {
        return sale;
    }
}

