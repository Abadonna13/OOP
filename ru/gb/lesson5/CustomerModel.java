package ru.gb.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CustomerModel {

    // customerModel -> [api (view), service (presenter), repository (model)]

    private List<Customer> storage = new ArrayList<>();

    public void create(String name) {
        storage.add(new Customer(name));
    }

    public List<Customer> getAll() {
        return List.copyOf(storage);
    }

    public Customer getById(UUID id) {
        return storage.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }


}
