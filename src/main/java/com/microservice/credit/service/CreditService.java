package com.microservice.credit.service;

import com.microservice.credit.domain.model.Credit;
import com.microservice.credit.domain.repository.CreditRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {

    private final CreditRepository repository;

    public CreditService(CreditRepository repository) {
        this.repository = repository;
    }

    public List<Credit> getCredits() {
        return repository.findAll();
    }

    public Credit createCredit(final Credit credit) {
        return (Credit) repository.save(credit);
    }
}
