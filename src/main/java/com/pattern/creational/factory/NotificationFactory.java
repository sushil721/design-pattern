package com.pattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {

    public static Notification buildNotification(String type) {
        if (type.equals("EMAIL")) {
            return new EmailNotification();
        } else if (type.equals("SMS")) {
            return new SmsNotification();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }

    public static List<Notification> buildNotifications(List<String> types) {
        /*return types.stream()
                .map(NotificationFactory::buildNotification)
                .toList();*/
        List<Notification> notifications = new ArrayList<>();
        for (String type : types) {
            notifications.add(buildNotification(type));
        }
        return notifications;
    }
}
