package com.pattern.behavioral.chainOfResponsibility;

public class TechTeam implements CustomerSupportHandler{
    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL3")){
            // Technical Team Logic
            IO.println("Technical Team resolved the issue.");
            issue.setStatus("SUCCESS");
        } else {
            IO.println("Issue could not be resolved");
            issue.setStatus("FAILED");
        }
    }
}
