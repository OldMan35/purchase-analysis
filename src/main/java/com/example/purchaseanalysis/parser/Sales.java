package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SALES")
public class Sales {

    public Sales() {
    }

    public Sales(List<Sale> sale) {
        this.sale = sale;
    }

    @XmlAnyElement
    private List<Sale> sale = new ArrayList<>();

    @XmlElement(name = "SALE")
    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }

    public List<Sale> getSale() {
        return sale;
    }
}

