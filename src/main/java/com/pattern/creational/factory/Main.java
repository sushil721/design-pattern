package com.pattern.creational.factory;


public class Main {
    static void main() {
        OrderService orderServiceClient = new OrderService();
        orderServiceClient.sendNotification("SMS");

        DeliveryService deliveryServiceClient = new DeliveryService();
        deliveryServiceClient.sendNotification("EMAIL");
    }
}
