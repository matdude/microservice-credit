package com.microservice.credit.domain.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Credit {

    @Id
    @GeneratedValue
    public Long id;

    @NotNull
    public String creditName;

    @NotNull
    public Long customerId;

}
