package ru.gb.lesson5.HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {

    // view <-> presenter
    // view -> presenter -> view

    private StudGroupePresenter studGroupePresenter;
    private StudentPresenter studentPresenter;

    private final Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void setStudGroupePresenter(StudGroupePresenter studGroupePresenter) {
        this.studGroupePresenter = studGroupePresenter;
    }

    public void setStudentPresenter(StudentPresenter studentPresenter) {
        this.studentPresenter = studentPresenter;
    }

    public void start() {
        while (true) {
            System.out.println("""
                    Список доступных команд:
                    1. group create {number}
                    2. group list
                    3. student create {F I O} {groupId}
                    4. student list
                    5. student {groupId}
                    6. exit
                    """);
            String command = scanner.nextLine();

            if ("exit".equals(command)) {
                break;
            }

            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];
            String[] args = Arrays.copyOfRange(commandArray, 1, commandArray.length);

            if ("group".equals(commandName)) {
                handleGroupCommand(args);
            } else if ("student".equals(commandName)) {
                handleStudentCommand(args);
            } else {
                System.err.println("Неизвестная команда");  // ошибка
            }
        }
    }

    public void printAllGroupe(List<StudGroupe> studGroupes) {
        System.out.println(studGroupes);
    }

    private void handleGroupCommand(String[] args) {
        if (args.length == 2) {
            String groupNumber = args[1];
            studGroupePresenter.create(groupNumber);
        } else if (args.length == 1 && "list".equals(args[0])) {
            studGroupePresenter.getAll();

//            List<Customer> customers = customerPresenter.getAll();
//            System.out.println(customers);
        } else {
            System.err.println("Неизвестная команда");
        }
    }

    private void handleStudentCommand(String[] args) {
        if (args.length == 1) {
            if ("list".equals(args[0])) {
                System.out.println(studentPresenter.getAll());
            } else {
                String studeGroupeId = args[0];
                System.out.println(studentPresenter.getByStudGroupe(studeGroupeId));
            }
        } else if (args.length == 5 && "create".equals(args[0])) {
            String name = args[1] + " " + args[2] + " " + args[3];
            String studGroupId = args[4];
            studentPresenter.create(name, studGroupId);
        } else {
            System.err.println("Неизвестная команда");
        }
    }

}
