package com.example.purchaseanalysis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="SALES")
public class SalesModelFromXml {

    @XmlElement
    private int CARD_NUMBER;

    @XmlElement
    private int DATA;

    @XmlElement
    private int PRODUCT_CODE;

    @XmlElement
    private String NAME;

    @XmlElement
    private int PRICE;

    @XmlElement
    private int COUNT;
}
