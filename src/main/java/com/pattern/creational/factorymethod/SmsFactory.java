package com.pattern.creational.factorymethod;

import com.pattern.creational.factory.Notification;
import com.pattern.creational.factory.SmsNotification;

public class SmsFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
