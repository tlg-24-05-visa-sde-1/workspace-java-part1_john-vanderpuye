package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthdate) {
    // for free, you get the following in the PersonRecord.class file:
    // 2 private fields
    // 2-arg ctor
    // getters for each
    // toString()
    // equals() and hashCode() - more on these later
    public int age(){
        return Period.between(birthdate, LocalDate.now()).getYears();
    }
}
