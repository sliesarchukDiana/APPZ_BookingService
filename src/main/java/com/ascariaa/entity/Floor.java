package com.ascariaa.entity;

import java.util.ArrayList;
import java.util.List; /**
 * Складений простір, що містить інші простори.
 * Роль у шаблоні Composite: Composite (Контейнер).
 * Зберігає дочірні компоненти та делегує їм виконання операцій.
 */
public class Floor implements Space {
    private String name;
    private List<Space> spaces = new ArrayList<>();

    /**
     * Створює новий поверх.
     *
     * @param name назва поверху
     */
    public Floor(String name) {
        this.name = name;
    }

    /**
     * Додає новий простір (кімнату або інший вкладений об'єкт) до поверху.
     *
     * @param space об'єкт, що реалізує інтерфейс Space
     */
    public void addSpace(Space space) {
        spaces.add(space);
        System.out.println("Floor.addSpace(): Додано простір до " + this.name);
    }

    /**
     * Виводить деталі поверху та рекурсивно викликає getDetails() для всіх вкладених компонентів.
     */
    @Override
    public void getDetails() {
        System.out.println("Floor.getDetails() : Поверх " + this.name);
        for (Space space : spaces) {
            space.getDetails();
        }
    }
}
