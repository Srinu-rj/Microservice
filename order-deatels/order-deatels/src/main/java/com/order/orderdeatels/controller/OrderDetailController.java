package com.order.orderdeatels.controller;


import com.order.orderdeatels.entuti.OrderDetails;
import com.order.orderdeatels.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderDetailController {

    private final OrderDetailService orderDetailService;
    @PostMapping("/add")
    public OrderDetails addOrderDetails(@RequestBody OrderDetails details){
        return orderDetailService.saveOrder(details);
    }
    @PostMapping("/addMore")
    public List<OrderDetails> saveOrders(@RequestBody List<OrderDetails> orderDetails) {
        return orderDetailService.saveOrders(orderDetails);
    }

    @GetMapping("/get")
    public List<OrderDetails> fetchAllOrders() {
        return orderDetailService.getOrders();
    }

    @DeleteMapping("/delete/{orderId}")
    public String deleteOrderById(@PathVariable Integer orderId) {
        return orderDetailService.deleteorder(orderId);
    }
    @PutMapping("/update/{id}")
    public OrderDetails updateOrder(@RequestBody OrderDetails updateOrderDetails,Integer id){
        return orderDetailService.updateOrder(updateOrderDetails,id);
    }

}
