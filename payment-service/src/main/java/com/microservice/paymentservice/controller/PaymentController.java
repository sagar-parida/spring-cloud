package com.microservice.paymentservice.controller;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/")
    public List<Payment> getAllPayments(){
        return paymentService.getPayments();
    }

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment){
        return paymentService.savePayment(payment);
    }
}
