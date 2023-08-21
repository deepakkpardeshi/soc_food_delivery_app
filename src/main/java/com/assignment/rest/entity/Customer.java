package com.assignment.rest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName ="customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long customerId;

    @Column(
            nullable = false,
            unique = true
    )
    private String customerName;

    @Column(
            nullable = false,
            unique = true
    )
    private String emailId;
    @Column(
            nullable = false
    )
    @JsonIgnore
    private String password;
}
