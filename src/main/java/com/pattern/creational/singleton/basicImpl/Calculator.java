package com.pattern.creational.singleton.basicImpl;

public class Calculator {
    int a;
    int b;

    // step-1: Create a private static instance of the class
    private static Calculator instance = new Calculator();
    // step-2: Create a private constructor of the class
    private Calculator() {
    }

    // step-3: Create a public static method to get the instance of the class
    public static Calculator getInstance() {
        return instance;
    }

    public int sum() {
        return a + b;
    }
}
