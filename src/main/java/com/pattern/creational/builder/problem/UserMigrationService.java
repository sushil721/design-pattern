package com.pattern.creational.builder.problem;

public class UserMigrationService  {
    public void migrateUser(String name, int age, String email) {
        User user = new User(name, age, email);

        System.out.println("Migrating user: " + user);
    }
}
