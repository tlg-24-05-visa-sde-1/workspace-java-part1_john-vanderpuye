package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {
    public static final double STANDARD_DEDUCTION = 1000000.0;
    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work(){
        System.out.println(getName() + " enjoying a nice round of golf");
    }

    // OPT-IN to override fileReturn() - do it differently
    @Override
    public void fileReturn(){
        System.out.println("Return filed electronically");
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }
}