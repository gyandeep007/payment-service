package com.example.paymentservice.controller;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentController {

    private PaymentService paymentService;
    private Logger logger = LoggerFactory.getLogger(PaymentController.class);
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("{paymentId}")
    public Payment getPaymentById(@PathVariable Long paymentId){
        logger.info("request receive for /{}",paymentId);
        return paymentService.getPaymentById(paymentId);
    }

    @GetMapping("/orders/{orderId}")
    public Payment getPaymentByOrderId(@PathVariable Long orderId){
        logger.info("request receive for /orders/{}",orderId);
        return paymentService.getPaymentByOrderId(orderId);
    }
}
