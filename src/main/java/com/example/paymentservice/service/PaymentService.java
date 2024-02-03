package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment getPaymentById(Long paymentId){
        return paymentRepository.findById(paymentId).get();
    }

    public Payment getPaymentByOrderId(Long paymentId){
        return paymentRepository.findPaymentByOrderId(paymentId);
    }
}
