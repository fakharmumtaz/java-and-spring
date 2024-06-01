package com.javalogic.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateChars {
        public static void main(String[] args) {
            // given input string
            String input = "JavaJavaEEb";

            //input.chars().forEach(System.out::println);
            ///input.chars().mapToObj(c -> new Character((char)c)).forEach(System.out::println);

            // convert string into stream
            Map< Character, Long > result =
                    input.chars().mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            result.forEach( (k, v) -> {
                if (v > 1) {
                    System.out.println(k + " : " + v);
                }
            });
        }
    }