package com.microservice.credit.controller;


import com.microservice.credit.domain.model.Credit;
import com.microservice.credit.service.CreditService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/credit")
@RestController
public class CreditController {

    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @GetMapping(value = "getCredits")
    public List<Credit> getCredits() {
        List<Credit> credits =creditService.getCredits();
        return credits;
    }

    @PostMapping
    public void createCredit(@RequestBody Credit credit) {
        Credit credit1 = new Credit();
        creditService.createCredit(credit1);
    }
}
