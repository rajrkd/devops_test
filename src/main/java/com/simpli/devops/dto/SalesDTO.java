package com.simpli.devops.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalesDTO {
    long bookId;
    String bookName;
    String authorName;
    long saleId;
    Date saleDate;
    double saleValue;
    String customerName;
}
