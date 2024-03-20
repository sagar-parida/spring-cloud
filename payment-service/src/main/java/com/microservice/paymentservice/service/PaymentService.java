package com.microservice.paymentservice.service;

import com.microservice.paymentservice.entity.Payment;
import com.microservice.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment){
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
}
