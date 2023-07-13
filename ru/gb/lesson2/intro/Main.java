package ru.gb.lesson2.intro;

import ru.gb.lesson1.Account;
import ru.gb.lesson1.FixedAmountAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // List, Set, Map, Queue, Deque, Collection
        // Stack, ArrrayList, LinkedList, ArrayDeque, HashMap, TreeMap, TreeSet, LinkedHashSet

        // class EXTENDS class
        // class IMPLEMENTS interface1, interface2, interface3
        // interface EXTENDS interface1, interface2, interface3

        // Анонимные классы
        // Функциональные интерфейсы

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        integers.stream()
                .filter(x -> x > 5)
                .map(x -> String.valueOf(x))
                .map(x -> x.repeat(5))
                .forEach(x -> System.out.println(x));



        List<Integer> list = new ArrayList<>();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    list.add(i);
                }
            }
        };

        Runnable lambda = () -> list.add(0);
//            for (int i = 0; i < 10_000_000; i++) {
//                list.add(0);
//            }
//        };

        System.out.println(lambda.getClass().getName());

        System.out.println(timer(lambda));


        // Comparable, Comparator
        // Iterator, Iterable
    }

    private static void functionalInterfaces() {
        // no args, no result -> Runnable
        Runnable action = () -> System.out.println("abcd");

        // no args, exists result -> Supplier
        Supplier<Integer> integerSupplier = () -> 1;
        Supplier<Account> accountSupplier = FixedAmountAccount::new;

        // exists arg, no result -> Consumer
//        Consumer<String> stringPrinterConsumer = arg -> System.out.println(arg);
        Consumer<String> stringPrinterConsumer = System.out::println;
        stringPrinterConsumer.accept("abcxdsfadsfasdf");

        // exists arg, exist resulut -> Function
        Function<String, Integer> stringLengthFunction = String::length;

        // exists arg, boolean result -> Predicate
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;

    }

    private static long timer(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        return end - start;
    }

}
