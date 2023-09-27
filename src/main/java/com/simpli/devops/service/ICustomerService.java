package com.simpli.devops.service;

import com.simpli.devops.model.Customers;

import java.util.List;

public interface ICustomerService {
    Customers saveCustomer(Customers customers);

    List<Customers> getCustomers();

    Customers getCustomer(long customerId);

    List<Customers> getCustomersByEmail(String email);
}
