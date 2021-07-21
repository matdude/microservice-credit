package com.microservice.credit.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("customer")
public interface CustomerConnector {

    @GetMapping("/{creditId}")
    ResponseEntity<CustomerDto> getCustomers(@PathVariable Long creditId);
}
