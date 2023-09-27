package com.simpli.devops.service;

import com.simpli.devops.dto.SalesDTO;
import com.simpli.devops.model.Sales;

import java.util.Date;
import java.util.List;

public interface ISalesService {
    List<Sales> getAllSales();

    Sales saveSaleTransaction(Sales sales);

    //List<Sales> getSaleByBookId(long bookId);
    List<Sales> getSaleByCustomerId(long customerId);

    List<SalesDTO> getSalesDetails(long bookId);

    List<Sales> getSaleByDate(Date saleDate);
}
