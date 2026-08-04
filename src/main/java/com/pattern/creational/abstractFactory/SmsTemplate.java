package com.pattern.creational.abstractFactory;

public class SmsTemplate implements Template{
    @Override
    public void formate() {
        System.out.println("Formatting SMS Template");
    }
}
