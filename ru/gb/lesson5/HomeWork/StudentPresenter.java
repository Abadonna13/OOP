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

    public void create(String name, String studGroupeId) {
        StudGroupe studGroupe = studGroupeModel.getById(UUID.fromString(studGroupeId));
        if (studGroupe != null) {
            studentModel.create(name,studGroupe);
        }
    }

//    public List<Order> getAll() {
//        return orderModel.getAll();
//    }
//
//    public List<Order> getByCustomer(String customerId) {
//        Customer customer = customerModel.getById(UUID.fromString(customerId));
//        if (customer != null) {
//            return orderModel.getByCustomer(customer);
//        }
//        return List.of();
//    }

}
