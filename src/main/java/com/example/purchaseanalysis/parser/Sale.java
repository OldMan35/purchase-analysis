package com.example.purchaseanalysis.parser;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @XmlElement
    private int CARD_NUMBER;

    @XmlElement
    private int DATA;

    @XmlElement
    private List<Products> PRODUCTS;

}
