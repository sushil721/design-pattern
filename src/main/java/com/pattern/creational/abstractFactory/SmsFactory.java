package com.pattern.creational.abstractFactory;

import com.pattern.creational.factory.Notification;
import com.pattern.creational.factory.SmsNotification;

public class SmsFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }

    @Override
    public Template createTemplate() {
        return new SmsTemplate();
    }
}
