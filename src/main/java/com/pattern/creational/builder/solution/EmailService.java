package com.pattern.creational.builder.solution;


public class EmailService {
    public void sendEmail() {

        UserBuilder userBuilder = new UserBuilder();
        userBuilder
                .setEmail("sushil@mail.com")
                .setAge(30)
                .setName("EmailService");
        User user = new User(userBuilder);
        System.out.println("Sending email to: " + user);
    }
}
