package ru.gb.lesson1;

import java.math.BigDecimal;

public class FixedAmountAccount extends AbstractAccount {

    public FixedAmountAccount() {
        super(BigDecimal.valueOf(10_000_000));
    }

    @Override
    protected boolean canPut(BigDecimal increase) {
        return false;
    }

    @Override
    protected boolean canTake(BigDecimal decrease) {
        return false;
    }
}
