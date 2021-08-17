package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SALES")
public class SaleRoot {

    @XmlElement(name = "SALE")
    private List<Sale> sale;

    public SaleRoot() {
    }

    public SaleRoot(List<Sale> sale) {
        this.sale = sale;
    }

    public List<Sale> getSale() {
        return sale;
    }

    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }
}

