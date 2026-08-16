package com.pattern.structural.adapter.problem;

// Here we want to use PayPal gateway but this class return type and params are different.
// So we use adapter pattern...
public class PaymentService {

    PaypalGateway paypalGateway = new PaypalGateway();
    RazorpayGateway razorpayGateway = new RazorpayGateway();

    // Without Adapter pattern.
    // Limitations: Here we unable to implement RazorpayGateway with PayPalGateway at a time, because its method structures are different.
    // We have tightly coupled instead there should be Plugged and Play.
    public String pay(int amount, int customerId){
        // payment logic to be added here
        int result = paypalGateway.doTransaction(Double.valueOf(amount), customerId);
        return (result==1)? "SUCCESS" : "FAILED";
    }
}
