package ru.gb.lesson4;

import java.util.List;
import java.util.Map;

public class Lesson4Main {

    public static void main(String[] args) {
        // Generic Обобщение

        // int, long, double, float, short, ...
        // Integer -> Number
        // Double -> Number

        NumberStorage<Number> numberStorage = new NumberStorage<>();

        NumberStorage<Integer> integers = new NumberStorage<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        NumberStorage<Double> doubles = new NumberStorage<>();
        doubles.add(1.1);
        doubles.add(1.1);
        doubles.add(1.1);

        System.out.println(integers.sum()); // 15.0
        System.out.println(doubles.sum());

        List<Integer> intValues = integers.getAllNumbers(); // [1, 2, 3, 4, 5]
        System.out.println(intValues);

        List<Double> doubleValues = doubles.getAllNumbers();
        System.out.println(doubleValues);


    }

    interface A {
        void foo();
    }

    interface B {
        void bar();
    }

    interface C {
        void buzz();
    }

    // T type
    // E element
    // K key, V value
    // P parameter
    // S subclass
    class Generic<T> {

    }

}
