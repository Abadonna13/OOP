package ru.gb.lesson1;

import java.math.BigDecimal;

public interface Account {

    void put(BigDecimal amount);

    void take(BigDecimal amount);

}
