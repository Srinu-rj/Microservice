package com.customer.customer.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int customerId;

    public String fullName;
    public Integer age;
    public String gender;
    public String mobileNumber;
    public String email;


//
//    @OneToOne(cascade = CascadeType.ALL)
//    public Address address;


//	@OneToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
//	public FoodCart foodCart;
}
