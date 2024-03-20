package com.microservice.paymentservice.controller;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody  Payment payment){
        return paymentService.savePayment(payment);
    }
}
