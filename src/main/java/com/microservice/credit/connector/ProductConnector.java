package com.microservice.credit.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product")
public interface ProductConnector {

    @GetMapping("/{creditId}")
    public ResponseEntity<ProductDto> getProducts(@PathVariable Long creditId);
}
