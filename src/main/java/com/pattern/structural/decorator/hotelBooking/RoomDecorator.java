package com.pattern.structural.decorator.hotelBooking;

// implements Room: IS-A relationship
public abstract class RoomDecorator implements Room{

    //HAS-A relationship
    Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }
}
