package com.customer.customer.repository;

import com.customer.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c  FROM  Customer c WHERE c.email =:email")
    Customer findByEmail(@Param("email") String email);



//    @Query(value = "SELECT C from Customer c WHERE c.mobileNumber =:mobileNumber",nativeQuery = true)
//    Customer findByMobileNumber(@Param("mobileNumber") String mobileNumber);

}
