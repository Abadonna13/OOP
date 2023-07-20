package ru.gb.lesson5.HomeWork;

import java.util.List;

public class StudGroupePresenter {
    private final View view;
    private final StudGroupeModel model;

    public StudGroupePresenter(View view, StudGroupeModel model) {
        this.view = view;
        this.model = model;
    }

    public void create(String groupeNumber) {
        model.create(groupeNumber);
    }

    public void getAll() {
        List<StudGroupe> all = model.getAll();
        view.printAllGroupe(all);
    }

}
