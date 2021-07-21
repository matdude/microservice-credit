package com.microservice.credit.controller;

import com.microservice.credit.connector.CustomerDto;
import com.microservice.credit.domain.model.CreditDto;
import com.microservice.credit.provider.CustomerProvider;
import com.microservice.credit.service.CreditService;
import com.microservice.credit.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api/v1/credit")
@RestController
@RequiredArgsConstructor
public class CreditController {

    private final CreditService creditService;
    private final CustomerService customerService;

    @GetMapping
    public List<CreditDto> getCredits() {
        List<CreditDto> credits =creditService.getCredits();
        return credits;
    }


    @PostMapping
    public CreditDto createCredit(@RequestBody @Valid CreditDto creditDto) {
        return creditService.createCredit(creditDto);
    }
}