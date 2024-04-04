package com.customer.customer.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerWithAddress {

    public int addressId;

    public String area;
    public String city;
    public String state;
    public String country;
    public String pinCode;
}
