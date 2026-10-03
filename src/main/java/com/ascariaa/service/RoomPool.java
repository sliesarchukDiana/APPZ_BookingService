package com.ascariaa.service;

import com.ascariaa.entity.Room;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Реалізує шаблон Object Pool (Пул об'єктів).
 * Роль у шаблоні: Пул об'єктів. Зберігає набір заздалегідь ініціалізованих
 * екземплярів кімнат. Управляє їхньою видачею та поверненням, оптимізуючи
 * продуктивність системи за рахунок уникнення частого створення та знищення об'єктів.
 */
public class RoomPool {
    private final Queue<Room> pool = new LinkedList<>();

    /**
     * Ініціалізує пул заданою кількістю об'єктів кімнат.
     *
     * @param size початкова кількість кімнат у пулі
     */
    public RoomPool(int size) {
        for (int i = 0; i < size; i++) {
            pool.add(new Room("POOL-" + i, "Standard Meeting", 5));
        }
        System.out.println("Object Pool: Created " + size + " rooms");
    }

    /**
     * Отримує вільну кімнату з пулу.
     *
     * @return екземпляр Room, або null, якщо пул порожній
     */
    public Room acquireRoom() {
        Room room = pool.poll();
        System.out.println("Object Pool: Acquired room " + (room != null ? room.getId() : "empty"));
        return room;
    }

    /**
     * Повертає використану кімнату назад у пул.
     *
     * @param room екземпляр Room, який повертається
     */
    public void releaseRoom(Room room) {
        pool.offer(room);
        System.out.println("Object Pool: Released room " + room.getId());
    }
}