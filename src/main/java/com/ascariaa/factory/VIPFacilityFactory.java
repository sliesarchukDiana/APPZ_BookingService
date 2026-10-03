package com.ascariaa.factory;

import com.ascariaa.entity.Equipment;
import com.ascariaa.entity.Projector;
import com.ascariaa.entity.Room;

/**
 * Реалізує шаблон Abstract Factory (Абстрактна фабрика).
 * Роль у шаблоні: Конкретна фабрика (Concrete Factory). Створює сімейство
 * об'єктів, специфічних для VIP-обслуговування (VIP-кімната та відповідний проектор).
 */
public class VIPFacilityFactory implements FacilityFactory {
    @Override
    public Room createRoom(String id) {
        System.out.println("Abstract Factory: Creating VIP Room " + id);
        return new Room(id, "VIP Room", 10);
    }

    @Override
    public Equipment createEquipment() {
        System.out.println("Abstract Factory: Creating VIP Equipment");
        return new Projector();
    }
}