package ru.gb.lesson7;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StaticDemo {

    static int a;
    int b;

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        double nds = NdsResolverEnum.INSTANCE.getNds();


        NdsResolver ndsResolver = NdsResolver.getInstance();
//        NdsCalculator ndsCalculator = new NdsCalculator(ndsResolver);


        List<User> users = List.of(new User("Igor"), new User("User"), new User("Igor"));
        Set<String> uniqueNames = DateUtils.extractUnique(users, User::getName);


        StaticDemo nullObject = null;
        StaticDemo.a = 5;

        System.out.println(nullObject.a);


//        StaticDemo first = new StaticDemo();
//        System.out.println(first.a); // 0
//        System.out.println(first.b); // 0
//
//        StaticDemo second = new StaticDemo();
//
//        // first [a = 10, b = 5]
//        // second [a = 10, b = 10]
//
//        first.a = 5;
//        first.b = 5;
//
//        second.a = 10;
//        second.b = 10;
//
//        System.out.println(first.a); // 10
//        System.out.println(first.b); // 5
//
//        System.out.println(second.a); // 10
//        System.out.println(second.b); // 10
    }

}
