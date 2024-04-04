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
//    public String addressId;
    transient private List<CustomerWithAddress>customerWithAddresses;



//
//    @OneToOne(cascade = CascadeType.ALL)
//    public Address address;


//	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	public FoodCart foodCart;
}
