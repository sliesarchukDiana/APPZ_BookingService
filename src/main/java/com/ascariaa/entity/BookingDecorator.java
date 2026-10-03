package com.ascariaa.entity;

/**
 * Абстрактний декоратор бронювання.
 * Роль у шаблоні Decorator: Base Decorator.
 * Містить посилання на вкладений об'єкт {@link IBooking} і делегує йому виконання базових операцій.
 */
public abstract class BookingDecorator implements IBooking {
    /**
     * Об'єкт бронювання, який декорується.
     */
    protected IBooking wrappee;

    /**
     * Ініціалізує декоратор об'єктом, який потрібно обгорнути.
     *
     * @param wrappee об'єкт бронювання
     */
    public BookingDecorator(IBooking wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void confirm() {
        wrappee.confirm();
    }
}
