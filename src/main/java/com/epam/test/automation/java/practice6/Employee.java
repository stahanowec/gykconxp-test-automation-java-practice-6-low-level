package com.epam.test.automation.java.practice6;

public class Employee {

    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double toPay() {
        return salary + bonus;
    }
}
