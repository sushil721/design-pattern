package com.pattern.creational.singleton.threadSafety.solution1synchronized;

public class Calculator {
    int a;
    int b;

    private static Calculator instance ;

    private Calculator() {
        System.out.println("Calculator instance created");
    }

    public synchronized static Calculator getInstance() {
       if(instance == null) {
           instance = new Calculator();
       }
        return instance;
    }

    public int sum() {
        return a + b;
    }
}
