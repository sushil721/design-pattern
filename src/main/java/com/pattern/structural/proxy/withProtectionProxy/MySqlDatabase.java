package com.pattern.structural.proxy.withProtectionProxy;

public class MySqlDatabase implements Database{

    @Override
    public void delete() {
        IO.println("User Deleted");
    }
}
