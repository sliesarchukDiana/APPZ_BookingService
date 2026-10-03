package com.ascariaa.service;

import com.ascariaa.entity.Room;
import com.ascariaa.entity.Schedule;
import com.ascariaa.entity.User;

/**
 * Заступник для контролера бронювання.
 * Роль у шаблоні Proxy: Proxy (Заступник).
 * Контролює доступ до реального об'єкта {@link BookingController}, додаючи перевірку прав перед виконанням запиту.
 */
public class BookingProcessorProxy implements IBookingProcessor {
    private BookingController realController;

    /**
     * Ініціалізує проксі з посиланням на реальний контролер.
     *
     * @param realController екземпляр справжнього обробника
     */
    public BookingProcessorProxy(BookingController realController) {
        this.realController = realController;
    }

    /**
     * Перехоплює запит на бронювання, перевіряє права і, у разі успіху, делегує виконання реальному об'єкту.
     */
    @Override
    public void createBookingRequest(User user, Room room, Schedule schedule, String startTime, String endTime) {
        System.out.println("BookingProcessorProxy: Перевірка прав доступу користувача " + user.getId());

        if (hasAccess(user, room)) {
            realController.createBookingRequest(user, room, schedule, startTime, endTime);
        } else {
            System.out.println("BookingProcessorProxy: Відмовлено в доступі. Недостатньо прав для бронювання " + room.getId());
        }
    }

    /**
     * Перевіряє права доступу користувача до вказаної кімнати.
     *
     * @param user користувач, що ініціює запит
     * @param room кімната для бронювання
     * @return true, якщо доступ дозволено
     */
    private boolean hasAccess(User user, Room room) {
        return !user.getId().startsWith("GUEST");
    }
}