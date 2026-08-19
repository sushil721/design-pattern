package com.pattern.behavioral.chainOfResponsibility;

public class CustomerExecutive implements CustomerSupportHandler{

    private CustomerSupportHandler customerSupportHandler;

    public CustomerExecutive(CustomerSupportHandler customerSupportHandler) {
        this.customerSupportHandler = customerSupportHandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL2")){
            // Customer Executive Logic
            IO.println("Customer Executive resolved the issue.");
            issue.setStatus("SUCCESS");
        } else {
            IO.println("Executive could not resolve the issue. " +
                    "Forwarding to the next handler: Technical Team.");
            issue.setStatus("PENDING");
            customerSupportHandler.handleRequest(issue);
        }
    }
}
