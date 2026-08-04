package com.pattern.creational.factorymethod;

import com.pattern.creational.factory.EmailNotification;
import com.pattern.creational.factory.Notification;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
