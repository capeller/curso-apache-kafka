package com.capeller.paymentservice.service;

import com.capeller.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
