package com.pattern.structural.adapter.problem;

public class PaymentClient {

    PaymentService paymentService = new PaymentService();

    public void makePayment(){
        String result = paymentService.pay(100,123);
        if(result.equals("SUCCESS")){
            IO.println("Payment  done successfully");
        } else {
            IO.println("Payment Failed");
        }
    }
}
