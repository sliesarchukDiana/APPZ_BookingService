package com.ascariaa;

import com.ascariaa.entity.*;
import com.ascariaa.service.*;
import com.ascariaa.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" 1. Singleton ");
        BookingController controller = BookingController.getInstance();

        System.out.println("\n 2. Prototype ");
        Room baseRoom = new Room("R-01", "Base Layout", 20);
        Room clonedRoom = baseRoom.clone();
        clonedRoom.setId("R-02");

        System.out.println("\n 3. Factory Method ");
        RoomFactory basicFactory = new ConferenceRoomFactory();
        Room confRoom = basicFactory.createRoom("CONF-100");

        System.out.println("\n 4. Abstract Factory ");
        FacilityFactory vipFactory = new VIPFacilityFactory();
        Room vipRoom = vipFactory.createRoom("VIP-200");
        Equipment eq = vipFactory.createEquipment();
        eq.setup();

        System.out.println("\n 5. Object Pool ");
        RoomPool pool = new RoomPool(2);
        Room pooledRoom = pool.acquireRoom();

        System.out.println("\n 6. Builder ");
        User user = new User("U1", "John Doe");
        Booking booking = new Booking.Builder("B-1000")
                .room(pooledRoom)
                .user(user)
                .time("2023-10-25 10:00", "2023-10-25 12:00")
                .build();
        booking.confirm();

        pool.releaseRoom(pooledRoom);
    }
}