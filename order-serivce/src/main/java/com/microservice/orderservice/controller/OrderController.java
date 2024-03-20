package com.microservice.orderservice.controller;

import com.microservice.orderservice.common.Payment;
import com.microservice.orderservice.common.TransactionRequest;
import com.microservice.orderservice.common.TransactionResponse;
import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public List<Order> getOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("/orders")
    public TransactionResponse createOrder(@RequestBody TransactionRequest transactionRequest){
        return orderService.saveOrder(transactionRequest);
    }
}
