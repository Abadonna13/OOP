package ru.gb.lesson5;

public class Main {

    public static void main(String[] args) {
        // HTTP

        // MVC Model-View-Controller
        // MVP Model-View-Presenter

        // Приложение для управления покупателями и заказами
        // Customer Покупатель (идентификатор, имя)
        // Order Заказ (идентификатор, номер, дата создания, идентификатор покупателя)

        // Пользователь может:
        // 1. Создать (завести) нового покупателя
        // 2. Посмотреть список покупателей
        // 3. Создать заказ
        // 4. Посмотреть список заказов
        // 5. Посмотреть заказы покупателя

        CustomerModel customerModel = new CustomerModel();
        OrderModel orderModel = new OrderModel();

        // Для удобства
        customerModel.create("TestCustomer");
        orderModel.create(customerModel.getAll().get(0));

        View view = new View();

        CustomerPresenter customerPresenter = new CustomerPresenter(view, customerModel);
        OrderPresenter orderPresenter = new OrderPresenter(customerModel, orderModel);

        view.setOrderPresenter(orderPresenter);
        view.setCustomerPresenter(customerPresenter);

        view.start();


    }

}
