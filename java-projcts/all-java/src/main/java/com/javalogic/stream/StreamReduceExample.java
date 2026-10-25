package com.javalogic.stream;

import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // 1. Accumulator Only: Returns an Optional (handles empty streams safely)
        Optional<Integer> sumOptional = numbers.stream()
                .reduce((accumulator, element) -> accumulator + element);

        sumOptional.ifPresent(sum -> System.out.println("1. Accumulator sum: " + sum));


        // 2. Identity + Accumulator: Returns the raw type directly
        // The identity (0) acts as the starting value and the default for empty streams
        int sumWithIdentity = numbers.stream()
                .reduce(0, (accumulator, element) -> accumulator + element);

        System.out.println("2. Identity + Accumulator sum: " + sumWithIdentity);


        // 3. Identity + Accumulator + Combiner: Used for Parallel Streams
        // The combiner merges partial results produced by different threads
        int parallelSum = numbers.parallelStream()
                .reduce(0,
                        (accumulator, element) -> accumulator + element, // Accumulator
                        Integer::sum                                      // Combiner
                );

        System.out.println("3. Parallel Stream sum: " + parallelSum);
    }
}
