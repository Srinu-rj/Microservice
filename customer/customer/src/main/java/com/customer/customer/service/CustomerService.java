package com.customer.customer.service;

import com.customer.customer.entity.Customer;
import com.customer.customer.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> saveListOf(List<Customer> customers);

    List<Customer> getCustomer();

    Customer findByEmail(String email);

    Customer findById(int customerId) throws CustomerNotFoundException;

    Customer updateCustomer(Customer customer, int customerId);

}
