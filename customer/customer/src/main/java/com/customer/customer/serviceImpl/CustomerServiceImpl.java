package com.customer.customer.serviceImpl;


import com.customer.customer.entity.Customer;
import com.customer.customer.exception.CustomerNotFoundException;
import com.customer.customer.repository.CustomerRepository;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
//    private final AddressClientInterface addressClientInterface;

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
        List<Customer> customer= customerRepository.findAll();
        return customer;


//        List<Customer> customer= customerRepository.findAll();
//        customer.stream().map(cust->{
//            //TODO IMPORANT LOGIC
//            cust.setAddresssClients(addressClientInterface.getAddressService(cust.getCustomerId()));
//
//            return cust;
//        }).collect(Collectors.toList());
//        return customer;
    }

    @Override
    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Customer findById(int customerId) throws CustomerNotFoundException {
        Optional<Customer> opt = customerRepository.findById(customerId);
        if (opt.isPresent()) {
            return opt.get();
        }
        throw new CustomerNotFoundException("Not Found");
    }

    @Override
    public Customer updateCustomer(Customer customer, int customerId) {
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
