package com.example.purchaseanalysis.repository;

import com.example.purchaseanalysis.model.SaleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SaleModel, Integer> {

}
