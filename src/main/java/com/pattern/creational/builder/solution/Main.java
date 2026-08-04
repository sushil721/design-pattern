package com.pattern.creational.builder.solution;

public class Main {
    static void main() {
        new EmailService().sendEmail();
        new LoginService().registerUser();
        new UserMigrationService().migrateUser("Sushil", 30, "ss@outlook.com");

    }
}
