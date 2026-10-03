package com.ascariaa.entity;

/**
 * Реалізує шаблон Prototype (Прототип).
 * Роль у шаблоні: Конкретний прототип. Підтримує клонування власного об'єкта,
 * дозволяючи створювати нові екземпляри кімнат на основі існуючих конфігурацій (базових шаблонів)
 * без прив'язки до процесу їх ініціалізації.
 */
public class Room implements Cloneable {
    private String id;
    private String name;
    private int capacity;

    public Room(String id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Створює та повертає точну копію поточного об'єкта кімнати.
     *
     * @return клонований екземпляр Room або null, якщо клонування не підтримується
     */
    @Override
    public Room clone() {
        System.out.println("Prototype: Cloning room " + this.id);
        try {
            return (Room) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }

    /**
     * Виводить деталі кімнати (заглушка для бізнес-логіки).
     */
    public void getDetails() {
        System.out.println("Room.getDetails() : " + this.id);
    }
}