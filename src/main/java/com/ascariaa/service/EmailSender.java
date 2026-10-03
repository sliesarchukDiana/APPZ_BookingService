package com.ascariaa.service;

/**
 * Конкретна реалізація відправки через Email.
 * Роль у шаблоні Bridge: ConcreteImplementor.
 */
public class EmailSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("EmailSender.send(): Відправлено email - " + message);
    }
}
