package com.pattern.creational.singleton.threadSafety.problem;

public class Main {
    static void main() {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1: starting");
            Calculator.getInstance();
            System.out.println("Thread 1: end");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2: starting");
            Calculator.getInstance();
            System.out.println("Thread 2: end");
        });

        t1.start();
        t2.start();

    }
}
