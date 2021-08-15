package com.example.purchaseanalysis.parser;

import org.springframework.beans.factory.annotation.Value;

public class PurchaseParser {

    @Value("${upload.path}")
    private String uploadPath;

}
