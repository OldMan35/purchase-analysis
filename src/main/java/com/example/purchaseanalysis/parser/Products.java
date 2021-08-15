package com.example.purchaseanalysis.parser;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @XmlElement
    private List<Product> PRODUCT;
}
