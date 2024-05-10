package com.customer.customer.controller;

import com.customer.customer.entity.Customer;
import com.customer.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/save/list")
    public List<Customer> saveListCustomer(@RequestBody List<Customer> customers){
        return  customerService.saveListOf(customers);
    }
    @GetMapping("/get")
    public List<Customer> findAllCustomers() {
        return customerService.getCustomer();
    }
    @GetMapping("/findEmail/{email}")
    public Customer findByCustomerEmail(@PathVariable String email){
        return customerService.findByEmail(email);
    }
    @GetMapping("/findMobile/{mobileNumber}")
    public Customer findByMobileNumber(@PathVariable String mobileNumber){
        return customerService.findByMobileNumber(mobileNumber);
    }


}
