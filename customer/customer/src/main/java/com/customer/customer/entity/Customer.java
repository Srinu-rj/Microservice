package com.customer.customer.entity;



import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int customerId;

    public String fullName;
    public Integer age;
    public String gender;
    public String mobileNumber;
    public String email;
//    transient public List<AddresssClient> addresssClients;

}
