package net.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("John", LocalDate.of(2000,11,12));

        // print: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.getName(), p1.age());

        System.out.println(p1);

        PersonRecord p2 = new PersonRecord("William", LocalDate.of(2002, 3, 22));
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());
        System.out.println(p2);
    }
}