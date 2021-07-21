package com.microservice.credit.service;

import com.microservice.credit.domain.model.Credit;
import com.microservice.credit.domain.model.CreditDto;
import com.microservice.credit.domain.repository.CreditRepository;
import com.microservice.credit.mapper.CreditMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CreditService {

    private final static CreditMapper mapper = CreditMapper.INSTANCE;
    private final CreditRepository repository;

    public List<CreditDto> getCredits() {
        return repository.findAll()
                .stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }

    public Optional<CreditDto> getCredit(Long creditId) {
        return repository.findById(creditId)
                .map(mapper::mapToDto);
    }

    public CreditDto createCredit(final CreditDto creditDto) {
        Credit credit = mapper.mapTo(creditDto);
        repository.save(credit);
        return mapper.mapToDto(credit);
    }
}
