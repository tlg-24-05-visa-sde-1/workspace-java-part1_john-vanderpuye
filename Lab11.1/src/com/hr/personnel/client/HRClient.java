/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),2000));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2),50,40));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        dept.addEmployee(new SalariedEmployee("John", LocalDate.of(2010, 8, 24),3000.00));
        dept.addEmployee(new HourlyEmployee("James", LocalDate.of(2020, 2, 2),20.0,40.0));
        dept.addEmployee(new Executive("Oliver", LocalDate.of(2020, 2, 2), 1_000_000));

        dept.listEmployees();
        dept.workEmployees();
        dept.payEmployees();

        System.out.println("\nHoliday break");
        dept.holidayBreak();
    }
}