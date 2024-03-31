package com.order.orderdeatels.serviceImpl;


import com.order.orderdeatels.entuti.OrderDetails;
import com.order.orderdeatels.repo.OrderDetailRepo;
import com.order.orderdeatels.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailRepo orderDetailRepo;

    @Override
    public List<OrderDetails> saveOrders(List<OrderDetails> orderDetails) {
        return orderDetailRepo.saveAll(orderDetails);
    }

    @Override
    public List<OrderDetails> getOrders() {
        return orderDetailRepo.findAll();
    }


    @Override
    public String deleteorder(Integer orderId) {
        orderDetailRepo.deleteById(orderId);
        return "deleted your Order";
    }

    @Override
    public OrderDetails saveOrder(OrderDetails details) {
        return orderDetailRepo.save(details);
    }

    @Override
    public OrderDetails updateOrder(OrderDetails updateOrderDetails, Integer id) {
        OrderDetails existOrderDetails = orderDetailRepo.findById(updateOrderDetails.getOrderId())
                .orElseThrow(() -> new RuntimeException("No OrderId's Please Create.."));

        existOrderDetails.setOrderDate(updateOrderDetails.getOrderDate());
        existOrderDetails.setOrderStatus(updateOrderDetails.getOrderStatus());

        return orderDetailRepo.save(existOrderDetails);
    }
}

