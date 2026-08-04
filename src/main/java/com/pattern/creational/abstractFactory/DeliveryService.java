package com.pattern.creational.abstractFactory;

import com.pattern.creational.factory.Notification;

public class DeliveryService {

    public void sendNotification() {
       NotificationFactory factory = new EmailFactory();
       Notification notification = factory.createNotification();
       Template template = factory.createTemplate();
       notification.send();
       template.formate();
    }
}
