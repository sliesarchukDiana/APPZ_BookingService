package com.ascariaa.service;

/**
 * Конкретна реалізація відправки через SMS.
 * Роль у шаблоні Bridge: ConcreteImplementor.
 */
public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SmsSender.send(): Відправлено SMS - " + message);
    }
}
