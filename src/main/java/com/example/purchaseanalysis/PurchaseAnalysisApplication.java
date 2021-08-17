package com.example.purchaseanalysis;

import com.example.purchaseanalysis.parser.SaleRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PurchaseAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurchaseAnalysisApplication.class, args);
        SaleRoot saleRoot = new SaleRoot();
        saleRoot.print();
    }

}
