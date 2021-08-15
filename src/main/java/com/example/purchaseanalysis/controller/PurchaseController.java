package com.example.purchaseanalysis.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class PurchaseController {

    @Value("${upload.path}")
    private String uploadPath;


}
