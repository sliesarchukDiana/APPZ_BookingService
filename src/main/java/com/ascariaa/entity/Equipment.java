package com.ascariaa.entity;

/**
 * Інтерфейс базового обладнання.
 * Використовується абстрактними та конкретними фабриками (Abstract Factory) для стандартизації інфраструктури.
 */
public interface Equipment {
    /**
     * Заглушка налаштування обладнання.
     */
    void setup();
}