package com.customer.customer.serviceImpl;

import com.customer.customer.entity.Customer;
import com.customer.customer.exception.CustomerNotFoundException;
import com.customer.customer.repository.CustomerRepository;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> saveListOf(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Customer findById(long customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("customerId Not found"));
    }

    @Override
    public Customer updateCustomer(Customer customer, Long customerId) {
//        todo we are difine customerId are exits are not
        Customer exitsCustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("customerId Not found create "));

        exitsCustomer.setAge(customer.getAge());
        exitsCustomer.setEmail(customer.getEmail());
        exitsCustomer.setGender(customer.getGender());
        exitsCustomer.setFullName(customer.getFullName());
        exitsCustomer.setMobileNumber(customer.getMobileNumber());

        customerRepository.save(exitsCustomer);
        return exitsCustomer;

    }

//    @Override
//    public Customer findByMobileNumber(String mobileNumber) {
//        return customerRepository.findByMobileNumber(mobileNumber);
//    }
}
