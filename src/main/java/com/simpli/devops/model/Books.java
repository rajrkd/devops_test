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
@Table(name = "books")
public class Books implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private long bookId;

    @Column(name = "bookName", nullable = false)
    private String bookName;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private double bookPrice;

    @Column(name = "genre")
    private String bookGenre;

    @Column(name = "authorName")
    private String authorName;

    @Column(name = "publishedDate")
    private Date publishedDate;

}
