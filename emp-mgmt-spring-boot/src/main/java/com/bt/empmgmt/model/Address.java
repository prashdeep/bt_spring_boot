package com.bt.empmgmt.model;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
public class Address {

    public Address(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "city", unique = false, nullable = false)
    private String city;

    private String state;

    private String zipCode;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id", nullable = false, unique = true)
    private Employee employee;
}