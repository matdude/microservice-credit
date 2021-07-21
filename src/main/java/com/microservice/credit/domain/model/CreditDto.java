package com.microservice.credit.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditDto {

    private Long id;

    @NotNull
    private String creditName;

    @NotNull
    private Long customerId;
}
