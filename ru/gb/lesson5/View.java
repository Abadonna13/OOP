package ru.gb.lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

    // view <-> presenter
    // view -> presenter -> view

    private CustomerPresenter customerPresenter;
    private OrderPresenter orderPresenter;

    private final Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void setCustomerPresenter(CustomerPresenter customerPresenter) {
        this.customerPresenter = customerPresenter;
    }

    public void setOrderPresenter(OrderPresenter orderPresenter) {
        this.orderPresenter = orderPresenter;
    }

    public void start() {
        while (true) {
            System.out.println("""
                    Список доступных команд:
                    1. customer create {name}
                    2. customer list
                    3. order create {customerId}
                    4. order list
                    5. order {customerId}
                    6. exit
                    """);
            String command = scanner.nextLine();

            if ("exit".equals(command)) {
                break;
            }

            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];
            String[] args = Arrays.copyOfRange(commandArray, 1, commandArray.length);

            if ("customer".equals(commandName)) {
                handleCustomerCommand(args);
            } else if ("order".equals(commandName)) {
                handleOrderCommand(args);
            } else {
                // ошибка
            }
        }
    }

    public void printAllCustomers(List<Customer> customers) {
        System.out.println(customers);
    }

    private void handleCustomerCommand(String[] args) {
        if (args.length == 2) {
            String customerName = args[1];
            customerPresenter.create(customerName);
        } else if (args.length == 1 && "list".equals(args[0])) {
            customerPresenter.getAll();

//            List<Customer> customers = customerPresenter.getAll();
//            System.out.println(customers);
        } else {
            System.err.println("Неизвестная команда");
        }
    }

    private void handleOrderCommand(String[] args) {
        if (args.length == 1) {
            if ("list".equals(args[0])) {
                System.out.println(orderPresenter.getAll());
            } else {
                String customerId = args[0];
                System.out.println(orderPresenter.getByCustomer(customerId));
            }
        } else if (args.length == 2 && "create".equals(args[0])) {
            String customerId = args[1];
            orderPresenter.create(customerId);
        } else {
            System.err.println("Неизвестная команда");
        }
    }

}
