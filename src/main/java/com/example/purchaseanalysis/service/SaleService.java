package com.example.purchaseanalysis.service;

import com.example.purchaseanalysis.repository.SaleRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    private final SaleRepository saleRepository;


    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

//    @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}") над методом сделать

}
