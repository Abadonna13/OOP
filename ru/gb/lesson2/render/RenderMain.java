package ru.gb.lesson2.render;

public class RenderMain {

    public static void main(String[] args) {
        // Visible, Editable, Enabled, ...


        // Представим, что мы пишем библиотеку для desktop-UI.
        // У нас есть базовый класс, который отвечает за отображение кнопки интерфейса - UiComponent.

        // Мы хотим реализовать код, который будет красить кнопки при наведении мышки на эту кнопку.
        // За это отвечает класс MouseHandler


        // Какой-то конкретный элемент интерфейса.

        // Код, отвечающий за покраску этого элемента, лучше завязать на интерфейс,
        // чтобы в будущем можно было реализовать этот интерфейс в любом компоненте и получить "из коробки" поддержку покраски.


        // class Hero, Building, Unit, Animal, ...
        // interface HasHealthPoint, HasManaPoint
        // class Render {
        //    void renderOnDisplay(Object object) {
        //
        //    }
        // }

    }

}
