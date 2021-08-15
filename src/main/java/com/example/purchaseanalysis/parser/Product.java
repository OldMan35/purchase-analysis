package com.example.purchaseanalysis.parser;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @XmlElement
    private int PRODUCT_CODE;

    @XmlElement
    private String NAME;

    @XmlElement
    private BigDecimal PRICE;

    @XmlElement
    private int COUNT;
}
