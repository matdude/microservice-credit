package com.microservice.credit.provider;

import com.microservice.credit.connector.CustomerConnector;
import com.microservice.credit.connector.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
public class CustomerProvider {

    private final CustomerConnector customerConnector;

    public CustomerDto getCustomer(@NotNull Long id) {
        return customerConnector.getCustomers(id).getBody();
    }
}
