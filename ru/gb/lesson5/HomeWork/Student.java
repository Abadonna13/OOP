package ru.gb.lesson5.HomeWork;

import java.util.Objects;

import java.util.UUID;

public class Student {
    private final UUID id;
    public final String name;
    private final StudGroupe studGroupe;

    public Student(String name, StudGroupe studGroupe) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.studGroupe = studGroupe;
    }

    public StudGroupe getStudGroupe() {
        return studGroupe;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "[" + id + "] (" + name + ") Groupe = {" + studGroupe + "}";
    }

}


