package com.javalogic.stream;

import com.javalogic.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
// creating Spring Boot Project directly in IntelliJ IDEA Community | Spring Boot Tutorial [HINDI]
public class CountChars {

    public static void main(String[] args) {
        String str = "I live in a beautifull world.";

        String strArr[] = str.split("");

        Long collect = Arrays.stream(strArr).collect(Collectors.counting());
        System.out.println(collect);


        Map<String, List<String>> collect1 = Arrays.stream(strArr).collect(Collectors.groupingBy(s -> s));
        System.out.println(collect1);

        Map<String, Long> collect2 = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

        List<Employee>  empList = Employee.getEmployeesList();
        Map<Employee, List<Employee>> collect3 = empList.stream().collect(Collectors.groupingBy(s -> s));
        System.out.println(collect3);

        //Map<Integer, Integer> collect4 =
        Map<Long, Long> collect4 = empList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.counting()));
        System.out.println(collect4);
    }
}
