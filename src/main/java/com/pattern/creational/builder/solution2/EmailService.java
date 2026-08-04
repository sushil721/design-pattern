package com.pattern.creational.builder.solution2;


public class EmailService {
    public void sendEmail() {

        User user = new User.UserBuilder()
                .setEmail("sushil@mail.com")
                .setAge(30)
                .setName("EmailService")
                .build();

        System.out.println("Sending email to: " + user);
    }
}
