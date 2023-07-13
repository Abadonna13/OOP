package ru.gb.lesson5;

import java.util.List;

public class CustomerPresenter {

    private final View view;
    private final CustomerModel model;

    public CustomerPresenter(View view, CustomerModel model) {
        this.view = view;
        this.model = model;
    }

    public void create(String customerName) {
        model.create(customerName);
    }

    public void getAll() {
        List<Customer> all = model.getAll();
        view.printAllCustomers(all);
    }
}
