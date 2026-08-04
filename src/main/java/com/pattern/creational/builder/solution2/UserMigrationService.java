package com.pattern.creational.builder.solution2;

public class UserMigrationService {
    public void migrateUser(String name, int age, String email) {
        User user = new User.UserBuilder()
                .setAge(30)
                .setEmail(email)
                .setName(name)
                .build();

        System.out.println("Migrating user: " + user);
    }
}
