package com.ascariaa.entity;

/**
 * Реалізує шаблон Builder (Будівельник).
 * Роль у шаблоні: Продукт (Product). Складний об'єкт бронювання,
 * який створюється покроково за допомогою вкладеного класу Builder.
 */
public class Booking {
    private String id;
    private Room room;
    private User user;
    private String startTime;
    private String endTime;

    Booking(Builder builder) {
        this.id = builder.id;
        this.room = builder.room;
        this.user = builder.user;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    /**
     * Підтверджує бронювання (заглушка бізнес-логіки).
     */
    public void confirm() {
        System.out.println("Booking.confirm() : " + this.id);
    }

    /**
     * Роль у шаблоні: Будівельник (Builder). Надає зручний (fluent interface)
     * інтерфейс для поетапного налаштування атрибутів бронювання перед його конструюванням.
     */
    public static class Builder {
        private String id;
        private Room room;
        private User user;
        private String startTime;
        private String endTime;

        /**
         * Ініціалізує будівельника з обов'язковим параметром.
         *
         * @param id унікальний ідентифікатор бронювання
         */
        public Builder(String id) { this.id = id; }

        /**
         * Встановлює кімнату для бронювання.
         *
         * @param room екземпляр кімнати
         * @return поточний екземпляр Builder для ланцюжкового виклику
         */
        public Builder room(Room room) {
            this.room = room;
            System.out.println("Builder: Set room " + room.getId());
            return this;
        }

        /**
         * Встановлює користувача, який здійснює бронювання.
         *
         * @param user екземпляр користувача
         * @return поточний екземпляр Builder
         */
        public Builder user(User user) {
            this.user = user;
            System.out.println("Builder: Set user " + user.getId());
            return this;
        }

        /**
         * Встановлює часові рамки бронювання.
         *
         * @param start час початку
         * @param end час закінчення
         * @return поточний екземпляр Builder
         */
        public Builder time(String start, String end) {
            this.startTime = start;
            this.endTime = end;
            return this;
        }

        /**
         * Завершує конструювання та створює фінальний об'єкт.
         *
         * @return сконструйований екземпляр {@link Booking}
         */
        public Booking build() {
            System.out.println("Builder: Building Booking instance");
            return new Booking(this);
        }
    }
}