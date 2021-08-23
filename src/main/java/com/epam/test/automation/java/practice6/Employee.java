package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
import java.math.MathContext;

public class Employee {

    private String name;
    private BigDecimal  salary;
    private double bonus;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        return salary.add(new BigDecimal(bonus));
    }
}
