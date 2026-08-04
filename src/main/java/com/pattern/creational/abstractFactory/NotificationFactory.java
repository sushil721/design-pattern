package com.pattern.creational.abstractFactory;

import com.pattern.creational.factory.EmailNotification;
import com.pattern.creational.factory.Notification;
import com.pattern.creational.factory.SmsNotification;

public interface NotificationFactory {

    Notification createNotification();
    Template createTemplate();

}
