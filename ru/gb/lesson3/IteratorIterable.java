package ru.gb.lesson3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class IteratorIterable {

    // iterator, iterable

    public static void main(String[] args) {
//        intro();

        // PDF-file on disk
        //

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        ArrayIterator arrayIterator = new ArrayIterator(array);

        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }

    static class ArrayIterator implements Iterator<Integer> {

        private final int[] array;
        private int cursor = 0;

        public ArrayIterator(int[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return array[cursor++];
            }
            throw new NoSuchElementException();
//            int toReturn = array[cursor];
//            cursor++;
//            return toReturn;
        }
    }


    private static void intro() {
        Iterable<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        Iterator var2 = strings.iterator();

        while(var2.hasNext()) {
            String next = (String)var2.next();
            System.out.println(next);
        }

        for (String next : strings) {
            System.out.println(next);
        }

        MyBox box = new MyBox();
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());

        for (Apple next: box) {
            System.out.println(next);
        }
    }



    static class MyBox implements Iterable<Apple> {
        private List<Apple> apples = new ArrayList<>();
        public void addApple(Apple apple) {
            apples.add(apple);
        }

        @Override
        public Iterator<Apple> iterator() {
            return apples.iterator();
        }
    }

    static class Apple {
        int weight = ThreadLocalRandom.current().nextInt(1, 10);

        @Override
        public String toString() {
            return "[" + weight + "]";
        }
    }

}
