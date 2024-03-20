package com.microservice.paymentservice.service;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public List<Payment> getPayments(){
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    public String paymentProcessing(){
        // Ideally should be a 3rd party gateway
        return new Random().nextBoolean() ? "Success" : "false";
    }
}
