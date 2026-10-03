package com.ascariaa.entity;

/**
 * Базовий інтерфейс бронювання.
 * Роль у шаблоні Decorator: Component (Компонент).
 * Визначає операції, які можуть бути динамічно змінені декораторами.
 */
public interface IBooking {
    /**
     * Підтверджує бронювання.
     */
    void confirm();
}

