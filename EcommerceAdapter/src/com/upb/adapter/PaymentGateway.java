package com.upb.adapter;

//Step 1 Create a common interface
public interface PaymentGateway {
    void processPayment(double amount);
}
