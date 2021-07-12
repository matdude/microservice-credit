package com.microservice.credit.domain.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit")
public class Credit {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    public String creditName;

    public Credit() {
    }

    public Credit(Long id, String creditName) {
        this.id = id;
        this.creditName = creditName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }
}
