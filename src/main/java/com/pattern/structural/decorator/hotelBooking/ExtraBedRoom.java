package com.pattern.structural.decorator.hotelBooking;

public class ExtraBedRoom extends RoomDecorator{

    public ExtraBedRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription()+ ", Extra Bed Room ";
    }

    @Override
    public int getCost() {
        return room.getCost() + 1000;
    }
}
