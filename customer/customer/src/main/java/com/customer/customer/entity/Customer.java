package com.customer.customer.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long customerId;

    public String fullName;
    public Integer age;
    public String gender;
    public String mobileNumber;
    public String email;

//    transient private List<CustomerWithAddress> customerWithAddresses;
}
