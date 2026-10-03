package com.ascariaa.entity;

/**
 * Зберігає незмінний (внутрішній) стан кімнати.
 * Роль у шаблоні Flyweight: Flyweight (Пристосуванець).
 * Об'єкт цього класу може спільно використовуватися багатьма контекстами для економії пам'яті.
 */
public class RoomType {
    private String name;
    private int capacity;

    /**
     * Ініціалізує незмінні характеристики типу кімнати.
     *
     * @param name назва типу (наприклад, "Conference Room")
     * @param capacity місткість
     */
    public RoomType(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Демонструє внутрішній стан пристосуванця.
     */
    public void displayCapabilities() {
        System.out.println("RoomType: " + name + ", Місткість: " + capacity);
    }
}

