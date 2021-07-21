package com.microservice.credit.connector;

import com.microservice.credit.domain.model.CreditDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private Long id;

    @NotNull
    private Long creditId;

    @NotNull
    private String firstName;

    @NotNull
    private String surname;
}
