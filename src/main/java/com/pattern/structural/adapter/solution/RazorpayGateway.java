package com.pattern.structural.adapter.solution;

// Consider it like a third party library class. We just want to call it internally.
// Client class will not call it directly.
public class RazorpayGateway {
    public boolean performTransaction(Double amount, int cId){
        // Razorpay's payment logic
        return true;
    }
}
