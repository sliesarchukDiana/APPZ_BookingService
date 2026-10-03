package com.ascariaa.factory;

import com.ascariaa.entity.Equipment;
import com.ascariaa.entity.Room;

/**
 * Реалізує шаблон Abstract Factory (Абстрактна фабрика).
 * Роль у шаблоні: Абстрактна фабрика. Надає інтерфейс для створення сімейства
 * пов'язаних об'єктів (кімнат та обладнання) без вказівки їхніх конкретних класів.
 */
public interface FacilityFactory {
    /**
     * Створює кімнату, сумісну з поточним сімейством об'єктів.
     *
     * @param id унікальний ідентифікатор кімнати
     * @return екземпляр Room
     */
    Room createRoom(String id);

    /**
     * Створює обладнання, сумісне з поточним сімейством об'єктів.
     *
     * @return екземпляр Equipment
     */
    Equipment createEquipment();
}