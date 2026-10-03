package com.ascariaa.entity;

/**
 * Клас користувача системи.
 * Сутність предметної області. Демонструє принцип High Cohesion (Висока зв'язність), відповідаючи лише за дані користувача.
 */
public class User {
    private String id;
    private String name;

    /**
     * Конструктор користувача.
     *
     * @param id унікальний ідентифікатор
     * @param name ім'я користувача
     */
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Повертає ідентифікатор користувача.
     *
     * @return id
     */
    public String getId() { return id; }

    /**
     * Заглушка виводу контактної інформації.
     */
    public void getContactInfo() {
        System.out.println("User.getContactInfo() called for: " + this.id);
    }
}