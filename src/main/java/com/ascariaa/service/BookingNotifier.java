package com.ascariaa.service;

/**
 * Абстракція для системи сповіщень.
 * Роль у шаблоні Bridge: Abstraction.
 * Делегує виконання роботи об'єкту реалізації, уникаючи жорсткої прив'язки до конкретного способу відправки.
 */
public class BookingNotifier {
    /**
     * Компонент для відправки сповіщень (реалізація мосту).
     */
    protected NotificationSender sender;

    /**
     * Ініціалізує абстракцію з конкретною реалізацією.
     *
     * @param sender реалізація способу сповіщення
     */
    public BookingNotifier(NotificationSender sender) {
        this.sender = sender;
    }

    /**
     * Ініціює процес сповіщення користувача.
     *
     * @param bookingId ідентифікатор бронювання
     */
    public void notifyUser(String bookingId) {
        System.out.println("BookingNotifier.notifyUser(): Ініціалізація сповіщення для бронювання " + bookingId);
        sender.send("Бронювання " + bookingId + " підтверджено.");
    }
}
