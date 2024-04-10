package com.customer.customer.serviceImpl;

import com.customer.customer.entity.Customer;
import com.customer.customer.repository.CustomerRepository;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
//    private final AddressClient addressClient;

    @Override
    public Customer add(Customer exitstcustomer) {
        Customer customer = customerRepository.save(exitstcustomer);
        return customer;
    }

    @Override
    public List<Customer> saveCustomer(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public List<Customer> getCustomer() {
//        List<Customer> customers = customerRepository.findAll();
        return customerRepository.findAll();

//        //todo connect to the address id with Json
//        List<Customer> customers1 = customers.stream().map(cust -> {
//            cust.setCustomerWithAddresses(addressClient.getAddressOfCustomer(cust.getCustomerId()));
//            return cust;
//        }).collect(Collectors.toList());
//        return customers1;
    }

    @Override
    public void deleteCustomerByid(Long customerId) {
        Customer exitsCustomer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Not Found"));
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer updateCustomer(Long customerId, Customer updateCustomer) {
        Customer customer1 = customerRepository.findById(customerId).orElseThrow(() -> new IllegalArgumentException("Not found Your ID"));

        Customer exitstcustomer = new Customer();

        exitstcustomer.setFullName(updateCustomer.getFullName());
        exitstcustomer.setGender(updateCustomer.getGender());
        exitstcustomer.setAge(updateCustomer.getAge());
        exitstcustomer.setMobileNumber(updateCustomer.getMobileNumber());
        exitstcustomer.setEmail(updateCustomer.getEmail());
        customerRepository.save(exitstcustomer);
        return exitstcustomer;
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Customer findByMobileNumber(String mobileNumber) {
        return customerRepository.findByMobileNumber(mobileNumber);
    }

    @Override
    public Customer get(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
//        Customer customer = customerRepository.findById(customerId)
//                .orElseThrow(() -> new IllegalArgumentException("There is no id"));
//        customer.setCustomerWithAddresses(addressClient.getAddressOfCustomer(customer.getCustomerId()));
//
//        return customer;
    }


}
