package com.simpli.devops.service;

import com.simpli.devops.model.Customers;
import com.simpli.devops.reposiitory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customers saveCustomer(Customers customers) {
        return customerRepository.save(customers);
    }

    @Override
    public List<Customers> getCustomers() {
        List<Customers> customersList = customerRepository.findAll();
        return customersList;
    }

    @Override
    public Customers getCustomer(long customerId) {
        Optional<Customers> optional = customerRepository.findByCustomerId(customerId);
        if (optional.isEmpty()) {
            return null;
        } else {
            return optional.get();
        }
    }

    @Override
    public List<Customers> getCustomersByEmail(String email) {
        Optional<List<Customers>> optional = customerRepository.findByEmail(email);
        if (optional.isEmpty()) {
            return null;
        } else {
            return optional.get();
        }
    }
}
