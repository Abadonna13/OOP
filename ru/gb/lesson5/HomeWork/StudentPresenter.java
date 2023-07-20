package ru.gb.lesson5.HomeWork;

import java.util.List;
import java.util.UUID;

public class StudentPresenter {

    private final StudentModel studentModel;
    private final StudGroupeModel studGroupeModel;

    public StudentPresenter(StudGroupeModel studGroupeModel, StudentModel studentModel) {
        this.studGroupeModel = studGroupeModel;
        this.studentModel = studentModel;
    }

    public void create(String name, String studGroupId) {
        StudGroupe studGroupe = studGroupeModel.getById(UUID.fromString(studGroupId));
        if (studGroupe != null) {
            studentModel.create(name,studGroupe);
        }
    }

    public List<Student> getAll() {
        return studentModel.getAll();
    }

    public List<Student> getByStudGroupe(String studeGroupId) {
        StudGroupe studGroupe = studGroupeModel.getById(UUID.fromString(studeGroupId));
        if (studGroupe != null) {
            return studentModel.getByGroupe(studGroupe);
        }
        return List.of();
    }

}
