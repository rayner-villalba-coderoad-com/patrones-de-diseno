package com.upb.adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ecommerce UPB!!!");

        double amount = 100.0;

        Paypal paypal = new Paypal();
        StripePaymentGateway stripe = new StripePaymentGateway();

        PayPalAdapter paypalAdapter = new PayPalAdapter(paypal);
        paypalAdapter.processPayment(amount);

        StripeAdapter stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(amount);


    }
}
