package com.pattern.creational.singleton.basicImpl;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = Calculator.getInstance();
        Calculator calculator2 = Calculator.getInstance();
        calculator1.a = 10;
        calculator1.b = 20;

        calculator2.a = 30;
        calculator2.b = 40;
        System.out.println("Sum: " + calculator1.sum());
        System.out.println("Sum: " + calculator2.sum());
    }
}
