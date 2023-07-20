package ru.gb.lesson5.HomeWork;

public class Homework {

    /**
     * Разработать свое MVP приложение со следующей моделью данных:
     * 1. Группа студентов (идентификатор, номер)
     * 2. Студент (идентификатор, имя, группа)
     * Реализовать стандартные операции:
     * - создание группы
     * - просмотр всех групп
     * - создание студента в группе
     * - просмотр всех студентов одной группы
     *
     * 3*. Реализовать новую сущность Урок (идентификатор, группа, дата).
     * - создание урока для групп
     * - просмотр всех уроков у студента
     *
     * lesson <-> studentGroup <- student
     */
    public static void main(String[] args) {

        StudGroupeModel studGroupeModel = new StudGroupeModel();
        StudentModel studentModel = new StudentModel();

        // Для удобства
        studGroupeModel.create("INF_01");
        studentModel.create("Тестов Тест Тестович",studGroupeModel.getAll().get(0));

        View view = new View();

        StudGroupePresenter groupePresenter = new StudGroupePresenter(view, studGroupeModel);
        StudentPresenter studentPresenter = new StudentPresenter(studGroupeModel, studentModel);

        view.setStudentPresenter(studentPresenter);
        view.setStudGroupePresenter(groupePresenter);

        view.start();
    }

}
