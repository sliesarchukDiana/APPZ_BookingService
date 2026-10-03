package com.ascariaa.service;

import com.ascariaa.entity.Room;
import com.ascariaa.entity.Schedule;
import com.ascariaa.entity.User;

/**
 * Стороння система календаря.
 * Роль у шаблоні Adapter: Adaptee (Адаптований клас).
 * Має несумісний із системою інтерфейс, який потребує адаптації.
 */
class ExternalCalendarApi {
    /**
     * Додає подію до зовнішнього календаря.
     *
     * @param userId ідентифікатор користувача
     * @param roomId ідентифікатор кімнати
     * @param start час початку
     * @param end час закінчення
     */
    public void addEvent(String userId, String roomId, String start, String end) {
        System.out.println("ExternalCalendarApi: Додано подію для " + userId + " у " + roomId + " [" + start + " - " + end + "]");
    }
}

/**
 * Адаптер для інтеграції зовнішнього календаря.
 * Роль у шаблоні Adapter: Adapter.
 * Реалізує цільовий інтерфейс {@link IBookingProcessor} та трансформує його виклики у формат, зрозумілий {@link ExternalCalendarApi}.
 */
public class CalendarAdapter implements IBookingProcessor {
    private ExternalCalendarApi externalApi = new ExternalCalendarApi();

    /**
     * Адаптує запит на бронювання до формату зовнішнього API.
     */
    @Override
    public void createBookingRequest(User user, Room room, Schedule schedule, String startTime, String endTime) {
        System.out.println("CalendarAdapter.createBookingRequest(): Адаптація запиту для зовнішнього API...");
        externalApi.addEvent(user.getId(), room.getId(), startTime, endTime);
    }
}