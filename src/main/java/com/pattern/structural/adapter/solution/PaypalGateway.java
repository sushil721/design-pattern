package com.pattern.structural.adapter.solution;

// Consider it like a third party library class. We just want to call it internally.
// Client class will not call it directly.
public class PaypalGateway {

    public int doTransaction(Double amount, int cId){
        //PayPal's logic here
        return 1;
    }

}
