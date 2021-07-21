package com.microservice.credit.service;

import com.microservice.credit.connector.CustomerDto;
import com.microservice.credit.provider.CustomerProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerProvider customerProvider;

    public CustomerDto findCustomer(Long creditId) {
        return customerProvider.getCustomer(creditId);
    }
}
