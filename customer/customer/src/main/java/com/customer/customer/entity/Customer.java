package com.customer.customer.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long customerId;

    public String fullName;
    public Integer age;
    public String gender;
    public String mobileNumber;
    public String email;

    transient private List<CustomerWithAddress>customerWithAddresses;


}
