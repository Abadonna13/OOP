package ru.gb.lesson1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOPIntro {

    public static void main(String[] args) {
        // JUnit
        // my-app.jar <- junit.jar

        // 1. Создали базовый класс счета, на котором есть какая-то сумма.
        // Счет можно пополнять и можно из него забирать средства.
        // Класс инкапсулирует в себе банковский счет (возможность пополнения и снятия средств).

        // 2. Создадим еще 2 счета: кредитный и депозитный.
        // Кредитный счет предполагает, что любое снятие происходит с комиссией в размере 1го процента
        // Депозитный счет предполагает ограничение в частоте снятия: не чаще раза в день.
        // Урезанный депозитный счет предполагает ограничение в частоте снятия: максимум n раз (задается в конструкторе) - ДЗ
        // Обычный счет, но с фиксированной суммой - 10_000_000

        // 3. Полиморфизм - способность функции (структуры) работать с подтипами (в плане наследования) своего аргумента без ограничений.

//        AbstractAccount account = new AbstractAccount(BigDecimal.TEN);
//        AbstractAccount depositAccount = new DepositAccount(BigDecimal.TEN);
//
//
//        printAccountState(new AbstractAccount());
//        printAccountState(new DepositAccount());
//        printAccountState(new CreditAccount());
//
//        List<AbstractAccount> accounts = new ArrayList<>();
//        accounts.add(new AbstractAccount());
//        accounts.add(new DepositAccount());
//        accounts.add(new CreditAccount());

        Parent parent = new Parent("asfasdf");
        Child child = new Child(); // field = "field"

    }

    private static void printAccountState(AbstractAccount account) {
        System.out.println("Account = " + account.getClass().getName() + ", current amount = " + account.getAmount());
    }

}
