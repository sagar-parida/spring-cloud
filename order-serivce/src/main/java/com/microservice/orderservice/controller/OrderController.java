package com.microservice.orderservice.controller;

import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
}
