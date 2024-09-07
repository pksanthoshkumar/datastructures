package org.opendesk.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortLambda {
    public static void main(String[] args) {
        List <Employee> employee = Arrays.asList(
                new Employee("Santhsoh", 2000),
                new Employee("Surekha", 3000),
                new Employee("Unknown", 1000),
                new Employee("Abhiram", 5000)
        );

        employee.sort((e1, e2) ->  Integer.compare(e1.salary(), e2.salary()) );
        System.out.println(employee);

        employee.sort((e1, e2)-> e1.name().compareTo(e2.name()));
        System.out.println(employee);

        employee.sort(Comparator.comparing(e->e.salary()));
        System.out.println(employee);
    }
}


record Employee (String name, int salary) {}