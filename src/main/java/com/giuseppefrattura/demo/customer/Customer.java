package com.giuseppefrattura.demo.customer;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @SequenceGenerator(name = "customerIdSequence", sequenceName = "customerIdSequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerIdSequence")
    private Integer id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }
}
