package com.ascariaa.service;

import com.ascariaa.entity.Room;
import com.ascariaa.entity.Schedule;
import com.ascariaa.entity.User;

/**
 * Інтерфейс процесора бронювань.
 * Відповідає принципу Dependency Inversion (DIP) з SOLID.
 * Абстрагує логіку обробки запитів на бронювання.
 */
public interface IBookingProcessor {
    /**
     * Створює запит на бронювання приміщення.
     *
     * @param user користувач, який створює бронювання
     * @param room кімната, яку бронюють
     * @param schedule розклад, у якому перевіряється доступність
     * @param startTime час початку бронювання
     * @param endTime час закінчення бронювання
     */
    void createBookingRequest(User user, Room room, Schedule schedule, String startTime, String endTime);
}