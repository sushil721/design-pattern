package com.pattern.creational.builder.solution;

public class LoginService {
    public void registerUser() {
        UserBuilder userBuilder = new UserBuilder();
        userBuilder
                .setEmail("sushil@mail.com")
                .setCity("Hyderabad")
                .setName("EmailService");
        User user = new User(userBuilder);
        System.out.println("Logging in user: " + user);
    }
}
