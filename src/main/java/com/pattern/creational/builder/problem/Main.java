package com.pattern.creational.builder.problem;

public class Main {
    static void main() {
        new EmailService().sendEmail();
        new LoginService().registerUser();
        new UserMigrationService().migrateUser("UserMigration", 30, "sushil@gmail.com");
        //Problem :: Suppose We added city field in User class and constructor
        // then we have to change all the classes which are using User class.
        // This is not good design.
        // So we can use Builder pattern to solve this problem.
    }
}
