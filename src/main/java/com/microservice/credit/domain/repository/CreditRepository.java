package com.microservice.credit.domain.repository;

import com.microservice.credit.domain.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditRepository extends JpaRepository {

    @Override
    List<Credit> findAll();
}
