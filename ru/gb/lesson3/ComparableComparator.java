package ru.gb.lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableComparator {

    // Comparable, Comparator

    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        boolean b = x > y;
        Set<Integer> integers = new TreeSet<>(Arrays.asList(4, 3, 5, 1, 2));
        System.out.println(integers);

        String s11 = "aaa";
        String s1 = "aaaaa";
        String s2 = "bbbb";
        String s3 = "ccc";
        String s4 = "ddddddddd";

//        boolean p = s11 > s1;
        boolean p = s11.compareTo(s1) > 0;

        Set<String> strings = new TreeSet<>(
                Comparator.comparingInt(String::length)
//                (o1, o2) -> o1.length() - o2.length()
//                new StringLengthComparator()
        );
        strings.addAll(Arrays.asList(s1, s11, s3, s2, s4));
//
        System.out.println(strings);


        Set<Person> personSet = new TreeSet<>(new PersonAgeComparator());
        personSet.addAll(Arrays.asList(new Person(10), new Person(15), new Person(85), new Person(54)));

        System.out.println(personSet);


    }

    static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

    static class PersonAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    static class Person /*implements Comparable<Person> */ {

        private final int age;

        public Person(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        //        @Override
        public int compareTo(Person another) {
            return age - another.age;
//            if (age == another.age) {
//                return 0;
//            } else if (age < another.age) {
//                return -1;
//            } else {
//                return 1;
//            }
        }

        @Override
        public String toString() {
            return "[" + age + "]";
        }
    }


}
