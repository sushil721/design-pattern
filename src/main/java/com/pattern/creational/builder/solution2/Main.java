package com.pattern.creational.builder.solution2;

public class Main {
    static void main() {
        new EmailService().sendEmail();
        new LoginService().registerUser();
        new UserMigrationService().migrateUser("Sushil", 30, "ss@outlook.com");

    }
}
