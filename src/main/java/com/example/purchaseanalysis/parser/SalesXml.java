package com.example.purchaseanalysis.parser;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "SALES")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesXml {

    @XmlElement(name = "SALE")
    private List<Sale> sale = new ArrayList<>();

}
