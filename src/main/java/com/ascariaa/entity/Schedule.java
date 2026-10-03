package com.ascariaa.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Розклад приміщення.
 * Сутність предметної області, що агрегує бронювання для певної кімнати.
 */
public class Schedule {
    private String roomId;
    private List<Booking> bookings;

    /**
     * Створює розклад для заданої кімнати.
     *
     * @param roomId ідентифікатор кімнати
     */
    public Schedule(String roomId) {
        this.roomId = roomId;
        this.bookings = new ArrayList<>();
    }

    /**
     * Перевіряє доступність часу в розкладі.
     * Заглушка бізнес-логіки.
     *
     * @param startTime час початку
     * @param endTime час закінчення
     * @return true, якщо час вільний
     */
    public boolean isAvailable(String startTime, String endTime) {
        System.out.println("Schedule.isAvailable(startTime=" + startTime + ", endTime=" + endTime + ") for roomId: " + roomId);
        return true;
    }

    /**
     * Створює нове бронювання у цьому розкладі за допомогою шаблону Builder.
     * Заглушка бізнес-логіки.
     *
     * @param bookingId id нового бронювання
     * @param room кімната
     * @param user користувач
     * @param startTime початок
     * @param endTime закінчення
     * @return створене бронювання
     */
    public Booking createBooking(String bookingId, Room room, User user, String startTime, String endTime) {
        System.out.println("Schedule.createBooking(bookingId=" + bookingId + ") for roomId: " + roomId);
        Booking newBooking = new Booking.Builder(bookingId)
                .room(room)
                .user(user)
                .time(startTime, endTime)
                .build();
        bookings.add(newBooking);
        return newBooking;
    }
}