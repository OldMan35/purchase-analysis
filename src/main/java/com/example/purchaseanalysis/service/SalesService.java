package com.example.purchaseanalysis.service;

import com.example.purchaseanalysis.repository.SalesRepository;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

    private final SalesRepository salesRepository;


    public SalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }


}
