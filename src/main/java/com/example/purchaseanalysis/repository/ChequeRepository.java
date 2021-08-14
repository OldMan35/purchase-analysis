package com.example.purchaseanalysis.repository;

import com.example.purchaseanalysis.model.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChequeRepository extends JpaRepository<Cheque, Integer> {

}
