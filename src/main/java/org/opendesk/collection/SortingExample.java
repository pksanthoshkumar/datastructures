package org.opendesk.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        List<Person> person = new ArrayList ();
        person.add (new Person("Santhosh", 60));
        person.add (new Person ("Surekha", 59));
        person.add (new Person ("Abhiram", 26));

        Collections.sort(person, new PersonOrderAge());

        System.out.println(person);
        Collections.sort(person, new PersonOrderName());
        System.out.println(person);
    }
}


record Person (String name, int age){}

class PersonOrderAge implements Comparator <Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.age() - p2.age();
    }
}


class PersonOrderName implements Comparator <Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name().compareTo(p2.name());
    }
}