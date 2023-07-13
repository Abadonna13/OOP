package ru.gb.lesson1;

import java.math.BigDecimal;

public abstract class AbstractAccount implements Account{

    private static long counter = 0L;

    // Неограниченный дробный точный тип данных.
    private BigDecimal amount;

    protected AbstractAccount() {
        this(BigDecimal.ZERO);
    }

    protected AbstractAccount(BigDecimal amount) {
        checkArgumentPositive(amount);

        this.amount = amount;
        counter++;
    }

    public static long getCounter() {
        return counter;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public void put(BigDecimal increase) {
        checkArgumentPositive(increase);
        if (canPut(increase)) {
            amount = amount.add(increase);
        }
    }

    protected abstract boolean canPut(BigDecimal increase);

    @Override
    public void take(BigDecimal decrease) {
        checkArgumentPositive(decrease);

        if (canTake(decrease)) {
            amount = amount.subtract(decrease);
        } else {
            throw new IllegalStateException("Невозможно снять средства");
        }
    }

    protected abstract boolean canTake(BigDecimal decrease);

    private void checkArgumentPositive(BigDecimal arg) {
        if (arg.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Аргумент должен быть положительным!");
        }
    }

}
