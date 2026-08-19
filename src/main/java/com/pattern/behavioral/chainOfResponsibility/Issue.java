package com.pattern.behavioral.chainOfResponsibility;

public class Issue {
    private String priority;
    private String status;

    public Issue(String priority, String status) {
        this.priority = priority;
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
