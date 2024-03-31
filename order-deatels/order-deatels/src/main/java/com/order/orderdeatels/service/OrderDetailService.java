package com.order.orderdeatels.service;


import com.order.orderdeatels.entuti.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderDetailService {
    List<OrderDetails> saveOrders(List<OrderDetails> orderDetails);

    List<OrderDetails> getOrders();


    String deleteorder(Integer orderId);

    OrderDetails saveOrder(OrderDetails details);

    OrderDetails updateOrder(OrderDetails updateOrderDetails, Integer id);
}
