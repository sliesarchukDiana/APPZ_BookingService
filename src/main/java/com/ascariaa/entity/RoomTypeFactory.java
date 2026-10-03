package com.ascariaa.entity;

import java.util.HashMap;
import java.util.Map; /**
 * Фабрика для створення та управління об'єктами RoomType.
 * Роль у шаблоні Flyweight: Flyweight Factory.
 * Гарантує, що існуючі екземпляри будуть використовуватися повторно, а нові створюватимуться лише за необхідності.
 */
public class RoomTypeFactory {
    private static Map<String, RoomType> types = new HashMap<>();

    /**
     * Повертає існуючий або створює новий тип кімнати на основі заданих параметрів.
     *
     * @param name назва типу
     * @param capacity місткість
     * @return екземпляр RoomType
     */
    public static RoomType getRoomType(String name, int capacity) {
        String key = name + "_" + capacity;
        if (!types.containsKey(key)) {
            types.put(key, new RoomType(name, capacity));
            System.out.println("RoomTypeFactory: Створено новий тип кімнати - " + name);
        }
        return types.get(key);
    }
}
