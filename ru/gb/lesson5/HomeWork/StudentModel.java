package ru.gb.lesson5.HomeWork;

import ru.gb.lesson5.Customer;
import ru.gb.lesson5.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
public class StudentModel {

    private List<Student> storage = new ArrayList<>();
    public void create(String name, StudGroupe studGroupe) {
        storage.add(new Student(name, studGroupe));
    }

    public List<Student> getAll() {
        return List.copyOf(storage);
    }

    public List<Student> getByGroupe(StudGroupe studGroupe) {
        return storage.stream()
                .filter(it -> Objects.equals(it.getStudGroupe(), studGroupe))
                .toList();
    }

}
