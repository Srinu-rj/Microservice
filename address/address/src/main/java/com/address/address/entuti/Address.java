package com.address.address.entuti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int addressId;

    public String area;
    public String city;
    public String state;
    public String country;
    public String pinCode;
//    public int customerId;


}

