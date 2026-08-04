package com.pattern.creational.abstractFactory;

public class EmailTemplate implements Template{
    @Override
    public void formate() {
        System.out.println("Formatting Email Template");
    }
}
