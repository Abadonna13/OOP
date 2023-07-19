package ru.gb.lesson5.HomeWork;
import ru.gb.lesson5.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
public class StudGroupeModel {

    private List<StudGroupe> storage = new ArrayList<>();

    public void create(String number) {
        storage.add(new StudGroupe(number));
    }

    public List<StudGroupe> getAll() {
        return List.copyOf(storage);
    }

    public StudGroupe getById(UUID id) {
        return storage.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

}
