package com.customer.customer.service;

import com.customer.customer.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer add(Customer customer);

    List<Customer> saveCustomer(List<Customer> customers);

    List<Customer> getCustomer();

    void deleteCustomerByid(Integer customerId);

    Customer updateCustomer(Integer customerId, Customer updateCustomer);

    Customer findByEmail(String email);

    Customer findByMobileNumber(String mobileNumber);
}
