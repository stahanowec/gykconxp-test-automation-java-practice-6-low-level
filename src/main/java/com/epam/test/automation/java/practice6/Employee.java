package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private BigDecimal  salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        if (requireNonNull(salary).compareTo(new BigDecimal(0)) <= 0) {
            throw new IllegalArgumentException();
        }
        return salary;
    }

    public BigDecimal getBonus() {
        if (requireNonNull(bonus).compareTo(new BigDecimal(0)) <= 0) {
            throw new IllegalArgumentException();
        }
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        requireNonNull(salary);
        requireNonNull(bonus);
        return salary.add(bonus);
    }

    public void validateBonus(BigDecimal bonus) {
        if (requireNonNull(bonus).compareTo(new BigDecimal(0)) <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T requireNonNull(T obj) {
        if (obj == null)
            throw new IllegalArgumentException();
        return obj;
    }

}
