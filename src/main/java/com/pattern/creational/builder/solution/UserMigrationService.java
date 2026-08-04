package com.pattern.creational.builder.solution;

public class UserMigrationService {
    public void migrateUser(String name, int age, String email) {
        User user = new User(
                new UserBuilder()
                .setAge(30)
                .setEmail(email)
                .setName(name));

        System.out.println("Migrating user: " + user);
    }
}
