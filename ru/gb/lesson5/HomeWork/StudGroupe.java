package ru.gb.lesson5.HomeWork;

import java.util.Objects;
import java.util.UUID;
public class StudGroupe {

    private final UUID id;
    private final String number;

    public StudGroupe(String number) {
        this.id = UUID.randomUUID();
        this.number = number;
    }

    public UUID getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudGroupe studGroupe = (StudGroupe) o;
        return id.equals(studGroupe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "[" + id + "] " + number;
    }

}
