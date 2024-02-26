package com.upb.adapter;

//Step 2 Create adapter and implements common interface
public class PayPalAdapter implements PaymentGateway {
    //De
    private Paypal paymentGateway;

    public PayPalAdapter(Paypal paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    @Override
    public void processPayment(double amount) {
        // Convert our application's method to PayPal's method
        paymentGateway.makePayment(amount);
    }
}
