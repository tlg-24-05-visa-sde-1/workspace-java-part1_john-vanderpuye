package com.hr.personnel;

import java.time.LocalDate;
import gov.irs.TaxPayer;

public class SalariedEmployee extends Employee {
    private double salary;
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    //business or action-oriented methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation");
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (getSalary()*SALARIED_TAX_RATE));
    }


    // accessor methods

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + getSalary();
    }
}