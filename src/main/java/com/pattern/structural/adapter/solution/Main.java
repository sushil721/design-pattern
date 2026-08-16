package com.pattern.structural.adapter.solution;

public class Main {
    static void main() {
        // Razorpay test
        PaymentClient paymentClientRazorPayTest =
                new PaymentClient(new RazorpayAdapter(new RazorpayGateway()));
        paymentClientRazorPayTest.makePayment();

        // PayPal  test
        PaymentClient paymentClientPaypalTest =
                new PaymentClient(new PaypalAdapter(new PaypalGateway()));
        paymentClientPaypalTest.makePayment();


    }
}