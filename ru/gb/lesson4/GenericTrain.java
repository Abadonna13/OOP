package ru.gb.lesson4;

import java.util.*;

public class GenericTrain {

    // A <- B <- C <- D <- E
    // A <- A1

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        // List <- ArrayList
        // List <- LinkedList
        Integer x = myMethod2(new HashMap<String, List<Integer>>());
        Double y = myMethod2(new HashMap<Integer, LinkedList<Double>>());
        Number z = myMethod2(new HashMap<String,  ArrayList<Number>>());


        Map<A, String> aKeyMap = null;
        Map<B, String> bKeyMap = null;

        copy(bKeyMap, aKeyMap);
    }

    // Метод, который копирует одну Map в другую (source -> target)
    // PECS Producer extends, Consumer super
    // Поставщик экстендс, Потребитель супер
    static <K, V> void copy(Map<? extends K, ? extends V> source, Map<? super K, ? super V> target) {

    }

    // Метод, который принимает Map, у которой ключ любой, а значение - список объектов типа Number.
    // Метод возвращает тот тип Number, который указан в списке.
    // Integer x = myMethod2(Map<String, List<Integer>> arg)
    // Double x = myMethod2(Map<Integer, LinkedList<Double>> arg)
    // Number x = myMethod2(Map<String,  ArrayList<Number>> arg)
    static <V extends Number> V myMethod2(Map<?, ? extends List<V>> map) {
        throw new UnsupportedOperationException();
    }


    // Метод, который принимает Map, у которой ключ как минимум B, А значение как минимум D.
    // Метод должен вернуть объект типа ключа Map.
    static <K extends B> K myMethod(Map<K, ? extends D> map) {
        throw new UnsupportedOperationException();
    }

//    public static void main(String[] args) {
//        List<A> aList = new ArrayList<>();
//        List<B> bList = new ArrayList<>();
//        List<C> cList = new ArrayList<>();
//        List<D> dList = new ArrayList<>();
//        List<E> eList = new ArrayList<>();
//
//        copy(aList, aList); // ok
//        copy(aList, bList); // no
//        copy(aList, cList); // no
//        copy(aList, dList); // no
//        copy(aList, eList); // no
//
//        // <T> void copy(List<? extends T> source, List<? super T> target)
//        // C <- B
//        // B, C
//        copy(bList, aList); // ok
//        copy(bList, bList); // ok
//        copy(bList, cList); // no
//        copy(bList, dList); // no
//        copy(bList, eList); // no
//
//        copy(cList, aList); // ok
//        copy(cList, bList); // ok
//        copy(cList, cList); // ok
//        copy(cList, dList); // no
//        copy(cList, eList); // no
//
//        copy(dList, aList);
//        copy(dList, bList);
//        copy(dList, cList);
//        copy(dList, dList);
//        copy(dList, eList);
//
//        copy(dList, aList);
//        copy(dList, bList);
//        copy(dList, cList);
//        copy(dList, dList);
//        copy(dList, eList);
//
//        A a = first(aList); // ok
//        B b = first(bList); // ok
//        C c = first(cList); // ok
//        D d = first(dList); // ok
//        E e = first(eList); // ok
//
//
//         foo(aList, aList);
//         foo(bList, bList);
//
//         bar(aList, bList);
//         bar(bList, aList);
//         bar(eList, aList);
//         bar(dList, eList);
//    }

//    static <T extends A> void foo(List<T> a, List<T> b) {
//
//    }
//
//    static void bar(List<? extends A> a, List<? extends A> b) {
//
//    }
//
//    // Копируем из source в target
//    // wildcard ?
//    // PECS Producer extends, Consumer super
//    // Поставщик экстендс, Потребитель супер
//    static <T> void copy(List<? extends T> source, List<? extends T> target) {
////        target.addAll(source);
//    }
//
//    static <T extends A> T first(List<T> list) {
//        return list.get(0);
//    }

    class A {

    }

    class B extends A {

    }

    class C extends B {

    }

    class D extends C {

    }

    class E extends D {

    }

}
