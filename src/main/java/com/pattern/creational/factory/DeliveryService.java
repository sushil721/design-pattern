package com.pattern.creational.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeliveryService {
   // Problem-1: This class has code duplication with OrderService class.
    /*
    private Notification notification;
    public void sendNotification(String type) {
        if (type.equals("EMAIL")) {notification = new EmailNotification();
        } else if (type.equals("SMS")) {notification = new SmsNotification();}
        notification.send();
    }*/

    // Solution: We can use Factory pattern to create NotificationFactory objects.
    public void sendNotification(String type) {
        Notification notification = NotificationFactory
                .buildNotification(type);
        notification.send();
    }

    // We can also use Factory pattern to create multiple NotificationFactory objects.
    public void sendMultiNotification() {
        List<Notification> notifications = NotificationFactory
                .buildNotifications(new ArrayList<>(Arrays.asList("EMAIL", "SMS")));
        for (Notification notification: notifications) {
            notification.send();
        }
    }
}
