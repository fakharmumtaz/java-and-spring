package com.coddecod.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java22PartitioningCountExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "pear", "orange", "banana", "kiwi");

        // Count fruits with length greater than 4 vs. 4 or less
        Map<Boolean, Long> fruitCount = fruits.stream()
                .collect(Collectors.partitioningBy(
                        f -> f.length() > 4,
                        Collectors.counting()
                ));

        System.out.println(fruitCount);
        // Output: {false=1, true=3} (pear is length 4 -> false; others -> true)
    }
}