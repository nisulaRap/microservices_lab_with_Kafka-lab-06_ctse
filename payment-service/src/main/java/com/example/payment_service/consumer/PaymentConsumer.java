package com.example.payment_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {
    @KafkaListener(topics = "order-topic", groupId = "billing-group")
    public void consume(String message) {

        System.out.println("Invoice Generated for Order: " + message);
    }
}
