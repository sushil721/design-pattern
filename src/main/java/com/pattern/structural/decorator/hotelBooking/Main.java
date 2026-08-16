package com.pattern.structural.decorator.hotelBooking;

public class Main {
    static void main() {
        Room room = new BasicRoom();
        IO.println("Description: " +room.getDescription() +" :: Cost:"+room.getCost());

        //Add breakfast feature
        room = new BreakfastRoom(room);
        IO.println("Description: " +room.getDescription() +" :: Cost:"+room.getCost());

        //Add Extra bed feature
        room = new ExtraBedRoom(room);
        IO.println("Description: " +room.getDescription() +" :: Cost:"+room.getCost());

        //Add Mini Bar feature
        room = new MiniBarRoom(room);
        IO.println("Description: " +room.getDescription() +" :: Cost:"+room.getCost());

    }
}
