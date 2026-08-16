package com.pattern.structural.adapter.solution;

public class PaypalAdapter implements PaymentService{

    PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway paypalGateway){
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String pay(int amount, int customerId) {

        int result = paypalGateway.doTransaction(Double.valueOf(amount), customerId);
        return (result == 1) ? "SUCCESS" : "FAILED";
    }
}
