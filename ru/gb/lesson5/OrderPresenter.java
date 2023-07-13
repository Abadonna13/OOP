package ru.gb.lesson5;

import java.util.List;
import java.util.UUID;

public class OrderPresenter {

    private final CustomerModel customerModel;
    private final OrderModel orderModel;

    public OrderPresenter(CustomerModel customerModel, OrderModel orderModel) {
        this.customerModel = customerModel;
        this.orderModel = orderModel;
    }

    public void create(String customerId) {
        Customer customer = customerModel.getById(UUID.fromString(customerId));
        if (customer != null) {
            orderModel.create(customer);
        }
    }

    public List<Order> getAll() {
        return orderModel.getAll();
    }

    public List<Order> getByCustomer(String customerId) {
        Customer customer = customerModel.getById(UUID.fromString(customerId));
        if (customer != null) {
            return orderModel.getByCustomer(customer);
        }
        return List.of();
    }

}
