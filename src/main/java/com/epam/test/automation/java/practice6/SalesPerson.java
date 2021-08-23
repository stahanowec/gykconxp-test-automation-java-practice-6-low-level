package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    private BigDecimal percent;

    public SalesPerson(String name, BigDecimal salary, BigDecimal bonus) {
        super(name, salary);
        this.percent = bonus;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (percent.compareTo(new BigDecimal(200)) > 0) {
            bonus = bonus.multiply(new BigDecimal(3));
        } else if (percent.compareTo(new BigDecimal(100)) > 0) {
            bonus = bonus.multiply(new BigDecimal(2));
        }
        super.setBonus(bonus);
    }
}
