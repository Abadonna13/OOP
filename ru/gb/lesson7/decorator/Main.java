package ru.gb.lesson7.decorator;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    static interface User {
        String name();
    }


//    static class User {
//        String name;
//
//        public User(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//    }

    public static void main(String[] args) {
//        User user = new User("asdf");
//        Proxy.getInvocationHandler(user);

        // Spring MVC
        // user

        Object userProxy = Proxy.newProxyInstance(User.class.getClassLoader(), new Class[]{User.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());
                System.out.println(proxy);


                System.out.println(proxy.getClass());
                System.out.println(args);

                return "abcde";
            }
        });

//        System.out.println(userProxy instanceof User);
//        System.out.println(userProxy.getClass().getName()); // Proxy$1

        String result = ((User) userProxy).name();
        System.out.println(result);


//        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
//        new DataOutputStream();
//        new ObjectOutputStream();
//        OutputStream pathOutputStream = Files.newOutputStream(Path.of("file.txt"));
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(pathOutputStream);
    }

}
