package com.pattern.creational.builder.problem;

public class LoginService {
    public void registerUser() {
        User user = new User("LoginService", 30, "");
        System.out.println("Logging in user: " + user);
    }
}
