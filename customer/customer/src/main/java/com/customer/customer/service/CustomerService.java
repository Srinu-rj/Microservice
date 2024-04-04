package com.customer.customer.service;

import com.customer.customer.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    Customer add(Customer customer);

    List<Customer> saveCustomer(List<Customer> customers);

    List<Customer> getCustomer();

    void deleteCustomerByid(Long customerId);

    Customer updateCustomer(Long customerId, Customer updateCustomer);

    Customer findByEmail(String email);

    Customer findByMobileNumber(String mobileNumber);

    Customer get(Long customerId);



//    CustomerWithAddress getAddressWithCustomer(Long addressId);
}
