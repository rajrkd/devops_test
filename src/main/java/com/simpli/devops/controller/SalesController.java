package com.simpli.devops.controller;

import com.simpli.devops.dto.SalesDTO;
import com.simpli.devops.model.Sales;
import com.simpli.devops.service.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/devops")
public class SalesController {
    @Autowired
    private ISalesService salesService;


    @GetMapping(value = "/getAllSales", produces = "application/json")
    public List<Sales> getAllSales() {
        return salesService.getAllSales();
    }

    @PostMapping(value = "/saveSale", consumes = "application/json", produces = "application/json")
    public Sales saveSale(@RequestBody Sales sale, Model model) {
        Sales sales = salesService.saveSaleTransaction(sale);
        model.addAttribute("saleId", sales.getSalesId());
        return sales;
    }

    @PostMapping(value = "/getSaleDetails", consumes = "application/json", produces = "application/json")
    public List getSaleByBookId(@RequestBody Sales Sales) {
        List<SalesDTO> salesDTOS = salesService.getSalesDetails(Sales.getBookId());

        if (salesDTOS.size() > 0) {
            return salesDTOS;
        } else {
            return null;
        }
    }
}
