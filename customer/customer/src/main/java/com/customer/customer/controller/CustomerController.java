package com.customer.customer.controller;


import com.customer.customer.entity.Customer;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.add(customer);
    }

    @PostMapping("/addMore")
    public List<Customer> addCustomer(@RequestBody List<Customer> customers) {
        return customerService.saveCustomer(customers);
    }

    @GetMapping("/get")
    public List<Customer> findAllCustomers() {
        return customerService.getCustomer();
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteById(@PathVariable Integer customerId) {
        customerService.deleteCustomerByid(customerId);
    }

    @PutMapping("/updateCustomer/{customerId}")
    public Customer updateCustomer(@PathVariable Integer customerId, @RequestBody Customer updateCustomer) {
        return customerService.updateCustomer(customerId, updateCustomer);
    }

    @GetMapping("/findEmail/{email}")
    public Customer findByCustomerEmail(@PathVariable String email) {
        return customerService.findByEmail(email);
    }

    @GetMapping("/findMobile/{mobileNumber}")
    public Customer findByMobileNumber(@PathVariable String mobileNumber) {
        return customerService.findByMobileNumber(mobileNumber);
    }
}
