package com.javalogic.codprob;

import com.javalogic.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseOfComparator {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // create a list of students - sort the list based on desc id

        List<Student> studentList = new ArrayList<>(10);
        studentList.add( new Student(3, "Fakhar"));
        studentList.add( new Student(2, "Marya"));
        studentList.add( new Student(4, "Rahil"));
        studentList.add( new Student(6, "Ahmad"));
        studentList.add( new Student(1, "Mumtaz"));


        Comparator<Student> sortOnId = (ob1, ob2) -> {
            if(ob1.getStudentId() < ob2.getStudentId())
                 return -1;
            if(ob1.getStudentId() == ob2.getStudentId())
                return 0;
            if(ob1.getStudentId() > ob2.getStudentId())
                return 1;
            return 0;
        };

        Comparator<Student> sortOnName = (ob1, ob2) ->
             ob1.getStudentName().compareTo( ob2.getStudentName());

        studentList.stream().sorted( sortOnId).forEach(System.out::println);
        System.out.println();
        studentList.stream().sorted( sortOnName).forEach(System.out::println);

      }
}
