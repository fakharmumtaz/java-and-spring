package com.javalogic.set;

import com.javalogic.model.Employee;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeHashsetCustomSort {
    public static void main(String[] args) {
        //Set<Integer> tset = new TreeSet<>();

        Comparator<Employee> com1 = (e1, e2) -> Long.compare(e1.getId(), e2.getId());
        Set<Employee> tset = new TreeSet<Employee>(com1);

        tset.add(new Employee(3, "Fakhar", "Mumtaz", 1998));
        tset.add(new Employee(6, "Zahid", "", 2001));
        tset.add(new Employee(2, "Fakhar", "Mumtaz", 1998));
        tset.add(new Employee(5, "Rahat", "", 2000));
        tset.add(new Employee(7, "Fakhar", "Mumtaz", 1998));
        tset.add(new Employee(4, "Aditya", "", 1999));
        System.out.println(tset+"------"); // Output: )
        System.out.println(tset.size()+"------"); // Output: )
    }
}
