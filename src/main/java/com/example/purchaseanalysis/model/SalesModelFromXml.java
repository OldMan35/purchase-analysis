package com.example.purchaseanalysis.model;

import lombok.AllArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesModelFromXml {
    @XmlElement
    private int card_number;

    @XmlElement
    private int data;

    @XmlElement
    private int product_code;

    @XmlElement
    private String name;

    @XmlElement
    private BigDecimal price;

    @XmlElement
    private int count;

    public SalesModelFromXml() {
    }
}
