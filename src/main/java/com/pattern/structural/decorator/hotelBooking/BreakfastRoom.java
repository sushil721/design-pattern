package com.pattern.structural.decorator.hotelBooking;

public class BreakfastRoom extends RoomDecorator{

    public BreakfastRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription()+ ", Breakfast ";
    }

    @Override
    public int getCost() {
        return room.getCost() + 300;
    }
}
