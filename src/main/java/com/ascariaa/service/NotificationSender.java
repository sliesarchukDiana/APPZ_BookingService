package com.ascariaa.service;

/**
 * Спільний інтерфейс для способів сповіщення.
 * Роль у шаблоні Bridge: Implementor (Реалізація).
 * Визначає базовий функціонал, який використовується абстракцією.
 */
public interface NotificationSender {
    /**
     * Відправляє повідомлення.
     *
     * @param message текст повідомлення
     */
    void send(String message);
}

