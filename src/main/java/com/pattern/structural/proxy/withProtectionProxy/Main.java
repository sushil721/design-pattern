package com.pattern.structural.proxy.withProtectionProxy;

public class Main {
    static void main() {
        Database db = new DatabaseProxy("admin", new MySqlDatabase());
        db.delete();

        Database db1 = new DatabaseProxy("manager", new MySqlDatabase());
        db1.delete();
    }
}
