package com.example.purchaseanalysis.parser;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement(name = "SALES")
public class SalesRoot {

    @XmlElement(name = "SALE")
    private List<SaleChild> sale;

    @XmlType
    public static class SaleChild {
        @XmlElement(name = "SALE")
        public Sale sale;
    }
    @XmlType
    public static class Sale{

    }

}

