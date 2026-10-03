package com.ascariaa.entity;

/**
 * Конкретне обладнання: Проектор.
 * Створюється за допомогою шаблону Abstract Factory.
 */
public class Projector implements Equipment {
    @Override
    public void setup() {
        System.out.println("Equipment: Projector setup complete.");
    }
}