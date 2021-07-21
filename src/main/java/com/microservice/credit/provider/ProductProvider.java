package com.microservice.credit.provider;

import com.microservice.credit.connector.ProductConnector;
import com.microservice.credit.connector.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
class ProductProvider {

    private final ProductConnector productConnector;

    public ProductDto getProduct(@NotNull Long creditId) {
        return productConnector.getProducts(creditId).getBody();
    }
}
