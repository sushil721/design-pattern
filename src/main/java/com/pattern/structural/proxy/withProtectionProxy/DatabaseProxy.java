package com.pattern.structural.proxy.withProtectionProxy;

public class DatabaseProxy implements Database{

    Database db;
    //Add protection
    private String role;

    public DatabaseProxy(String role, Database db) {
        this.db = db;
        this.role = role;
    }

    @Override
    public void delete() {
        if(role.equals("admin")) {
            db.delete();
        }else{
            IO.println("Access has been denied.");
        }
    }
}
