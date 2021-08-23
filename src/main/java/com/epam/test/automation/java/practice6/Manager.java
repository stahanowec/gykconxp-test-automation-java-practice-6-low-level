package com.epam.test.automation.java.practice6;

public class Manager extends Employee {
    private int quantity;

    public Manager(String name, double salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    @Override
    public void setBonus(double bonus) {
        if (quantity > 150) {
            bonus = bonus + 1000;
        } else if (quantity > 100) {
            bonus = bonus + 500;
        }
        super.setBonus(bonus);
    }
}
