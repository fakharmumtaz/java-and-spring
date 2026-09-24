package com.javalogic.codprob;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Student(String name, int marks) {}

public class ComparatorEx1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Charlie", 75),
                new Student("Alice", 97),
                new Student("Bob", 85),
                new Student("David", 99)
        ));

        // Sort by marks ascending, then by name ascending
        students.sort(
                Comparator.comparing(Student::marks)
                        .thenComparing(Student::name)
        );

        students.forEach(System.out::println);
        System.out.println(">>>>>>>>>>");
        List<Student> reversed = students.reversed();
        reversed.forEach(System.out::println);
    }
}