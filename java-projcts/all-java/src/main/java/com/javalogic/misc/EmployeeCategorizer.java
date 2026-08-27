package com.javalogic.misc;
//public class EmployeeCate { }
public class EmployeeCategorizer {
    public static String categorizeEmployeeAge(Object age) {
        return switch (age) {
            case Object o  when o.toString() == "" -> "String is ";
            case Integer i when i >= 15 && i < 25 -> "Youth Employee";
            case Integer i when i >= 25 && i <= 50 -> "Mid level Employee";
            case Integer i when i > 50 && i <= 65 -> "Senior Employee";
            default -> "Invalid Age for Employment";
        };
    }

    public static void main(String[] args) {
        System.out.println(categorizeEmployeeAge(22.0));
        System.out.println(categorizeEmployeeAge(35));
        System.out.println(categorizeEmployeeAge(60));
        System.out.println(categorizeEmployeeAge(80));
        System.out.println(categorizeEmployeeAge(new Object()));
    }
}
