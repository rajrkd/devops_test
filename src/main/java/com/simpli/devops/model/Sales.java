package com.simpli.devops.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sales implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesId")
    private long salesId;

    @Column(name = "salesDesc")
    private String salesDesc;

    @Column(name = "saleDate")
    private Date saleDate;

    @Column(name = "saleValue", nullable = false)
    private double saleValue;

    @Column(name = "bookId")
    private long bookId;

    @Column(name = "customerId")
    private long customerId;

    @Column(name = "authorName")
    private String authorName;

}
