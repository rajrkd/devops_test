package com.simpli.devops.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Customers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private long customerId;

    @Column(name = "customerName", nullable = false)
    private String customerName;

    @Column(name = "phoneNo", nullable = false)
    private String phoneNo;

    @Column(name = "email", nullable = false)
    private double email;

    @Column(name = "zipcode")
    private String zipcode;

}
