package com.microservice.orderservice.service;

import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
