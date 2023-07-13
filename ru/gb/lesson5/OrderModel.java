package ru.gb.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrderModel {

    private List<Order> storage = new ArrayList<>();

    public void create(Customer customer) {
        storage.add(new Order(customer));
    }

    public List<Order> getAll() {
        return List.copyOf(storage);
    }

    public List<Order> getByCustomer(Customer customer) {
        return storage.stream()
                .filter(it -> Objects.equals(it.getCustomer(), customer))
                .toList();
    }

}
