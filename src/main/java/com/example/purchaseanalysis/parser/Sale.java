package com.example.purchaseanalysis.parser;
import javax.xml.bind.annotation.*;



public class Sale {

    private Integer card_number;
    private Long date;

    public Integer getCard_number() {
        return card_number;
    }

    @XmlElement(name = "CARD_NUMBER")
    public void setCard_number(Integer card_number) {
        this.card_number = card_number;
    }

    public Long getDate() {
        return date;
    }

    @XmlElement(name = "DATE")
    public void setDate(Long date) {
        this.date = date;
    }
}
