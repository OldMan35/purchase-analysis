package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "SALES")
public class Sales {

    @XmlElement(name = "SALE")
    private List<Sale> sale;

    public List<Sale> getSale() {
        return sale;
    }

    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }

    public Sales() {
    }

    public Sales(List<Sale> sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "sale=" + sale +
                '}';
    }
}

