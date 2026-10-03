package com.ascariaa.factory;

import com.ascariaa.entity.Room;

/**
 * Реалізує шаблон Factory Method (Фабричний метод).
 * Роль у шаблоні: Абстрактний творець (Creator). Оголошує фабричний метод,
 * який повертає об'єкт типу Room. Дозволяє підкласам змінювати тип створюваних кімнат.
 */
public interface RoomFactory {
    /**
     * Фабричний метод для створення кімнати.
     *
     * @param id унікальний ідентифікатор нової кімнати
     * @return створений екземпляр Room
     */
    Room createRoom(String id);
}