package com.simpli.devops.dto;

import java.util.Date;

public interface ICustomBookSalesDTO {
    long getBookId();

    String getBookName();

    String getAuthorName();

    long getSaleId();

    Date getSaleDate();

    double getSaleValue();

    String getCustomerName();

}
