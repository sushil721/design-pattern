package com.pattern.creational.builder.solution2;

public class LoginService {
    public void registerUser() {
        User user = new User.UserBuilder()
                .setEmail("sushil@mail.com")
                .setCity("Hyderabad")
                .setName("EmailService")
                .build();

        System.out.println("Logging in user: " + user);
    }
}
