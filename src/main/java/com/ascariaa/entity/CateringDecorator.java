package com.ascariaa.entity;

/**
 * Конкретний декоратор, що додає послуги кейтерингу.
 * Роль у шаблоні Decorator: Concrete Decorator.
 * Розширює поведінку базового об'єкта, додаючи власну логіку після виконання стандартної.
 */
public class CateringDecorator extends BookingDecorator {
    /**
     * Ініціалізує декоратор кейтерингу.
     *
     * @param wrappee об'єкт бронювання
     */
    public CateringDecorator(IBooking wrappee) {
        super(wrappee);
    }

    /**
     * Виконує базове підтвердження та додає логіку кейтерингу.
     */
    @Override
    public void confirm() {
        super.confirm();
        addCatering();
    }

    private void addCatering() {
        System.out.println("CateringDecorator: Додано послуги кейтерингу до бронювання.");
    }
}
