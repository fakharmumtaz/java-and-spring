package com.javalogic.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateChars {
        public static void main(String[] args) {
            // given input string
            String input = "JavaJavaEEb";
            System.out.println("---------- input integer equivalents  ");
            input.chars().forEach(System.out::println);
            System.out.println("---------- String representation  ");
            input.chars().mapToObj(c -> (char)c).forEach(System.out::println);
            System.out.println("......................" + input );

            // convert string into stream
            Map< Character, Long > result =
                    input.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            result.forEach( (k, v) -> {
                if (v >= 1) {
                    System.out.println(k + " : " + v);
                }
            });
        }
    }