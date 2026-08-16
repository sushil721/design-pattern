package com.pattern.structural.adapter.solution;

public class PaymentClient {

    PaymentService paymentService ;

    public PaymentClient(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void makePayment(){
        String result = paymentService.pay(100,123);
        if(result.equals("SUCCESS")){
            IO.println("Payment  done successfully");
        } else {
            IO.println("Payment Failed");
        }
    }
}
