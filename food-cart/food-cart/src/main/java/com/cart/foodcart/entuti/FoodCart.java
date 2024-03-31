package com.cart.foodcart.entuti;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "foodcart")
public class FoodCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer cartId;

    public String categoryName;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    public Customer customer;
//
//
//    @OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
//    public List<Item> itemList;

}
