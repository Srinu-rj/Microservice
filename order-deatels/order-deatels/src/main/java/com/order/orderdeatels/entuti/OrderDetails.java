package com.order.orderdeatels.entuti;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    private LocalDateTime orderDate;
    private String orderStatus;
//    @CreationTimestamp
//    private LocalDateTime dateCreated;
//    @UpdateTimestamp
//    private LocalDateTime dateUpdate;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    private FoodCart cart;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    private   Bill bill;
}
