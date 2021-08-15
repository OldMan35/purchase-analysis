package com.example.purchaseanalysis.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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

}
