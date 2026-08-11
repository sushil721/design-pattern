package com.pattern.creational.singleton.threadSafety.solution2DoubleCheckLockingMechanism;

public class Calculator {
    int a;
    int b;

    private static Calculator instance ;

    private Calculator() {
        System.out.println("Calculator instance created");
    }

    public synchronized static Calculator getInstance() {
        if (instance == null) { // here we check if instance is null, if yes then we will enter the synchronized block, otherwise we will return the instance.
            synchronized (Calculator.class) {
                if (instance == null) {
                    instance = new Calculator();
                }
           }
       }
        return instance;
    }

    public int sum() {
        return a + b;
    }
}
