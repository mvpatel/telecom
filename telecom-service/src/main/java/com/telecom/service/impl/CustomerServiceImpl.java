package com.telecom.service.impl;

import com.telecom.model.dao.Customer;
import com.telecom.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    Set<Customer> customerSet = new HashSet<Customer>();

    @Override
    public Customer addCustomer(String name, String surname) {

        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);
        customerSet.add(customer);
        return customer;
    }
}
