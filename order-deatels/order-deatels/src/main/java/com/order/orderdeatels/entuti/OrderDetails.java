package com.order.orderdeatels.entuti;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer orderId;
    public LocalDateTime orderDate;
    public String orderStatus;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    public FoodCart cart;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    public   Bill bill;
}
