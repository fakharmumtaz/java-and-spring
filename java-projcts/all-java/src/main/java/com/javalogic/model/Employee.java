package com.javalogic.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private int year;
    public Employee(long id, String firstName,
                        String lastName, int year)  {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public static List<Employee> getEmployeesList(){
        Employee first=new Employee(4,"Ali","Pink", 2001);
        Employee second=new Employee(24,"Alina","Pink", 2000);
        Employee third=new Employee(11,"Alisha","Green", 2001);
        Employee fourth=new Employee(35,"Aliam","Pink", 2002);
        Employee fivth=new Employee(10,"Aliza","Green", 2000);
        List<Employee> smployees= Arrays.asList(first,second,third,fourth,fivth);
        return smployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && year == employee.year && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, year);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                '}';
    }
}
