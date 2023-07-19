package ru.gb.lesson6.l;

import java.awt.*;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        // Барбара Лисков

        // Если у вас есть метод method, который работает с типом Parent, и есть тип Child extends Parent,
        // то метод method должен корректно мочь работать с типом Child, не зная об этом

        Rectangle rectangle = createRectangle();
        rectangle.setX(2);
        rectangle.setY(4);

        System.out.println(rectangle.perimeter()); // 12

    }

    static double perimeter(Shape s) {
        if (s instanceof Circle circle) {
            return 2 * Math.PI * circle.radius();
        } else if (s instanceof Triangle triangle) {
            return triangle.a() + triangle.b() + triangle.c();
        }
        // ...
        throw new UnsupportedOperationException();
    }


    interface Shape {

    }

    static interface Circle {
        double radius();
    }

    static interface Triangle {
        double a();
        double b();
        double c();
    }


    static Rectangle createRectangle() {
        return new Square();
    }

    static class Square extends Rectangle {
        @Override
        public void setX(int x) {
            super.setX(x);
            super.setY(x);
        }

        @Override
        public void setY(int y) {
            super.setY(y);
            super.setX(y);
        }
    }

    // Прямоугольник
    static class Rectangle {

        private int x;
        private int y;

        public int perimeter() {
            return 2 * (x + y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

}
