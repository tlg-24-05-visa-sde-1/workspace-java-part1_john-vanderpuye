package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    //business or action-oriented methods
    @Override
    public void pay(){
        System.out.println(getName() + " is payed hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (getRate()*getHours()*HOURLY_TAX_RATE));
    }
    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRate: " + getRate() + "\nHours: " + getHours();
    }
}