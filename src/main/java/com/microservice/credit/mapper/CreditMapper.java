package com.microservice.credit.mapper;

import com.microservice.credit.domain.model.Credit;
import com.microservice.credit.domain.model.CreditDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CreditMapper {

    CreditMapper INSTANCE = Mappers.getMapper(CreditMapper.class);

    CreditDto mapToDto(Credit credit);

    Credit mapTo(CreditDto creditDto);
}
