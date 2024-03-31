package com.order.orderdeatels.repo;

import com.order.orderdeatels.entuti.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetails,Integer> {
}
