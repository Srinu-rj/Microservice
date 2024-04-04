package com.customer.customer.controller;


import com.customer.customer.entity.Customer;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/getAll")
    public List<Customer> findAllCustomers() {
        return customerService.getCustomer();
    }

    @GetMapping("/{customerId}")
    public Customer getOne(@PathVariable Long customerId) {
        return customerService.get(customerId);
    }

    @DeleteMapping("/delete/{customerId}")
    public void deleteById(@PathVariable Long customerId) {
        customerService.deleteCustomerByid(customerId);
    }

    @PutMapping("/updateCustomer/{customerId}")
    public Customer updateCustomer(@PathVariable Long customerId, @RequestBody Customer updateCustomer) {
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
