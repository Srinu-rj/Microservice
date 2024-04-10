package com.restaurant.restaurant.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Restaurant")
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int restaurantId;
    private String restaurantName;
    private String managerName;
    private String contactNumber;

    transient private List<ItemDto> itemDos;


//    @JsonIgnore
//    @OneToOne(cascade = CascadeType.ALL)
//    private Address address;
//
//    @OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
//    @JoinColumn
//    private List<Item> itemList = new ArrayList<>();


}