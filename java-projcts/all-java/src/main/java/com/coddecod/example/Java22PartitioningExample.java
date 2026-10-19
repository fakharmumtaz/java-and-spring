package com.coddecod.example;

// given an array of strings. write a java 8 or above program to find the length of the longest string
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java22PartitioningExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 14, 19, 47, 56, 72, 89, 3, 90, 18);

        // Partition numbers into even (true) and odd (false)
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even Numbers (true): " + partitioned.get(true));
        System.out.println("Odd Numbers (false): " + partitioned.get(false));


        Map<Boolean, Long> partitioned1 = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));

        System.out.println("Even Numbers Count (true): " + partitioned1.get(true));
        System.out.println("Odd Numbers Count (false): " + partitioned1.get(false));
    }
}
