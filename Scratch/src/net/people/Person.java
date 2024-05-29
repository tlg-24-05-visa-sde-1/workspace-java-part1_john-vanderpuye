package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * Immutable class. More accurately, this is a class definition written
 * in such a way that instances  of it , once created, cannot have their properties changed.
 * there are simply no public methods available to do so.
 */
class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * HINT: this is the period of time between birthDate and today's date, in whole years.
     */
    public int age(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), birthDate());
    }
}