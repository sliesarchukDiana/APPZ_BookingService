package com.ascariaa.factory;

import com.ascariaa.entity.Room;

/**
 * Реалізує шаблон Factory Method (Фабричний метод).
 * Роль у шаблоні: Конкретний творець (Concrete Creator). Перевизначає фабричний метод
 * для створення екземпляра конкретного типу кімнати — конференц-залу.
 */
public class ConferenceRoomFactory implements RoomFactory {
    @Override
    public Room createRoom(String id) {
        System.out.println("Factory Method: Creating Conference Room " + id);
        return new Room(id, "Conference Room", 50);
    }
}