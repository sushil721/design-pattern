package com.pattern.creational.builder.problem;

public class EmailService {
    public void sendEmail() {
        User user = new User("EmailService", 30, "sushil@gmail.com");
        System.out.println("Sending email to: " + user);
    }
}
