package com.bill.bill.entity;

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
public class Bill {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer billId;
    public LocalDateTime billDate;
    public Double totalCost;
    public Integer totalItem;

//
//    @OneToOne(cascade = CascadeType.ALL)
//    public OrderDetails order;
}
