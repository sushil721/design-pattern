package com.pattern.behavioral.chainOfResponsibility;

public class Chatbot implements CustomerSupportHandler{

    // Defines reference of Customer support handler.
    private CustomerSupportHandler customerSupportHandler;

    public Chatbot(CustomerSupportHandler customerSupportHandler) {
        // this is tightly coupled.
        //this.customerSupportHandler = new CustomerExecutive();

        // Loosely coupled.
        this.customerSupportHandler = customerSupportHandler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL1")){
            // Chatbot Logic
            IO.println("Chatbot resolved the issue.");
            issue.setStatus("SUCCESS");
        } else {
            IO.println("Chatbot could not resolve the issue. " +
                    "Forwarding to the next handler: Customer Executive.");
            issue.setStatus("PENDING");
            customerSupportHandler.handleRequest(issue);
        }
    }
}
