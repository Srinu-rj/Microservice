package com.customer.customer.repository;

import com.customer.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByEmail(String email);

    Customer findByMobileNumber(String mobileNumber);

}
