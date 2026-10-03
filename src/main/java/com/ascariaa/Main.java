package com.ascariaa;

import com.ascariaa.entity.*;
import com.ascariaa.service.*;

/**
 * Головний клас для тестування структурних шаблонів проєктування (Лабораторні роботи 6-8).
 */
public class Main {
    public static void main(String[] args) {
        User regularUser = new User("U-001", "Таня");
        User guestUser = new User("GUEST-001", "Невідомий");
        Room room1 = new Room("R-101", "Conference Room", 50);
        Schedule schedule = new Schedule("R-101");

        System.out.println(" Лабораторна робота №6 ");

        System.out.println("\n Шаблон Adapter ");
        IBookingProcessor adapter = new CalendarAdapter();
        adapter.createBookingRequest(regularUser, room1, schedule, "10:00", "12:00");

        System.out.println("\n Шаблон Bridge ");
        BookingNotifier emailNotifier = new BookingNotifier(new EmailSender());
        emailNotifier.notifyUser("B-1001");

        BookingNotifier smsNotifier = new BookingNotifier(new SmsSender());
        smsNotifier.notifyUser("B-1002");

        System.out.println("\n Лабораторна робота №7 ");

        System.out.println("\n Шаблон Composite ");
        Floor firstFloor = new Floor("Перший поверх");
        Floor mainBuilding = new Floor("Головний корпус");

        Space spaceRoom = new Space() {
            @Override
            public void getDetails() {
                room1.getDetails();
            }
        };

        firstFloor.addSpace(spaceRoom);
        mainBuilding.addSpace(firstFloor);
        mainBuilding.getDetails();

        System.out.println("\n Шаблон Flyweight ");
        RoomType type1 = RoomTypeFactory.getRoomType("Conference", 50);
        RoomType type2 = RoomTypeFactory.getRoomType("Conference", 50);
        RoomType type3 = RoomTypeFactory.getRoomType("VIP", 10);

        type1.displayCapabilities();
        type3.displayCapabilities();
        System.out.println("type1 == type2: " + (type1 == type2));


        System.out.println("\n Лабораторна робота №8 ");

        System.out.println("\n Шаблон Decorator ");
        Booking baseBooking = new Booking.Builder("B-2001")
                .room(room1)
                .user(regularUser)
                .time("14:00", "16:00")
                .build();

        IBooking bookingAdapter = new IBooking() {
            @Override
            public void confirm() {
                baseBooking.confirm();
            }
        };

        IBooking cateredBooking = new CateringDecorator(bookingAdapter);
        cateredBooking.confirm();

        System.out.println("\n Шаблон Proxy ");
        BookingController realController = BookingController.getInstance();
        IBookingProcessor proxy = new BookingProcessorProxy(realController);

        System.out.println("[Тест Proxy] Спроба 1 (Звичайний користувач):");
        proxy.createBookingRequest(regularUser, room1, schedule, "14:00", "16:00");

        System.out.println("\n[Тест Proxy] Спроба 2 (Користувач-гість):");
        proxy.createBookingRequest(guestUser, room1, schedule, "16:00", "18:00");
    }
}