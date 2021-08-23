package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    private double percent;

    public SalesPerson(String name, BigDecimal salary, double bonus) {
        super(name, salary);
        this.percent = bonus;
    }

    @Override
    public void setBonus(double bonus) {
        if (percent > 200) {
            bonus = bonus * 3;
        } else if (percent > 100) {
            bonus = bonus * 2;
        }
        super.setBonus(bonus);
    }
}
