package ru.gb.lesson7;

public class Sequence {

    private static long sequence = 1L;

    public static long next() {
        return sequence++;
    }

}
