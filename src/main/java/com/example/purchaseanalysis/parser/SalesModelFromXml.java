package com.example.purchaseanalysis.parser;

import com.example.purchaseanalysis.parser.Sale;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="SALES")
public class SalesModelFromXml {

    @XmlElement
    private List<Sale> SALE;


}
