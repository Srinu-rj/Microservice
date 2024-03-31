package com.customer.customer.serviceImpl;

import com.customer.customer.entity.Customer;
import com.customer.customer.repository.CustomerRepository;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;


    @Override
    public Customer add(Customer exitstcustomer) {
        return customerRepository.save(exitstcustomer);
    }

    @Override
    public List<Customer> saveCustomer(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerByid(Integer customerId) {
//		customerRepository.deleteById(customerId);
        if (customerId == 0 || customerId == null) {
            customerRepository.deleteById(customerId);
        } else {
            log.info("you need to create Customer Id");
        }
    }

//    @Override
//    public List<Customer> getAllCustomerByNative() {
//        return customerRepository.getAllCustomerByNative();
//    }

    @Override
    public Customer updateCustomer(Integer customerId, Customer updateCustomer) {
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


}
