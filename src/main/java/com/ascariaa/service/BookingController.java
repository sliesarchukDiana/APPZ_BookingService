package com.ascariaa.service;

import com.ascariaa.entity.Room;
import com.ascariaa.entity.Schedule;
import com.ascariaa.entity.User;

/**
 * Реалізує шаблон Singleton (Одинак).
 * Роль у шаблоні: Одинак. Гарантує існування лише одного екземпляра контролера
 * для централізованого управління запитами на бронювання в усій системі та надає глобальну точку доступу до нього.
 */
public class BookingController implements IBookingProcessor {
    private static BookingController instance;

    private BookingController() {}

    /**
     * Повертає єдиний екземпляр контролера бронювання.
     * Якщо екземпляр ще не створено, ініціалізує його (лінива ініціалізація).
     *
     * @return єдиний екземпляр BookingController
     */
    public static BookingController getInstance() {
        if (instance == null) {
            instance = new BookingController();
            System.out.println("Singleton: BookingController initialized");
        }
        return instance;
    }

    @Override
    public void createBookingRequest(User user, Room room, Schedule schedule, String startTime, String endTime) {
        System.out.println("BookingController.createBookingRequest(userId=" + user.getId() +
                ", roomId=" + room.getId() + ", startTime=" + startTime + ", endTime=" + endTime + ")");
        if (schedule.isAvailable(startTime, endTime)) {
            // Логіка створення бронювання
        }
    }
}