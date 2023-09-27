package com.simpli.devops.service;

import com.simpli.devops.dto.ICustomBookSalesDTO;
import com.simpli.devops.dto.SalesDTO;
import com.simpli.devops.model.Sales;
import com.simpli.devops.reposiitory.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SalesServiceImpl implements ISalesService {
    @Autowired
    SalesRepository salesRepository;


    @Override
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    @Override
    public Sales saveSaleTransaction(Sales sales) {
        return salesRepository.save(sales);
    }

    @Override
    public List<Sales> getSaleByCustomerId(long customerId) {
        Optional<List<Sales>> optional = salesRepository.findByCustomerId(customerId);
        return optional.get();
    }

    @Override
    public List<SalesDTO> getSalesDetails(long bookId) {
        List<ICustomBookSalesDTO> customBookSalesDTOS = salesRepository.findSalesByBookId(bookId);
        List salesDTOs = null;
        for (ICustomBookSalesDTO customDto : customBookSalesDTOS) {
            SalesDTO salesDTO = new SalesDTO();
            salesDTO.setSaleId(customDto.getSaleId());
            salesDTO.setBookId(customDto.getBookId());
            salesDTO.setBookName(customDto.getBookName());
            salesDTO.setAuthorName(customDto.getAuthorName());
            salesDTO.setCustomerName(customDto.getCustomerName());
            salesDTO.setSaleDate(customDto.getSaleDate());
            salesDTO.setSaleValue(customDto.getSaleValue());
            salesDTOs.add(salesDTO);
        }
        return salesDTOs;
    }

    @Override
    public List<Sales> getSaleByDate(Date saleDate) {
        Optional<List<Sales>> optional = salesRepository.findBySaleDate(saleDate);
        return optional.get();

    }
}
