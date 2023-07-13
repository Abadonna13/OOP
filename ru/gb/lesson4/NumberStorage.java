package ru.gb.lesson4;

import java.util.ArrayList;
import java.util.List;

public class NumberStorage<T extends Number> {

    private List<T> delegate = new ArrayList<>();

    public void add(T number) {
        delegate.add(number);
    }

    public double sum() {
        double sum = 0.0;
        for (T number : delegate) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public List<T> getAllNumbers() {
        return delegate;
    }

}
