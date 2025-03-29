package org.example;

import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        String str = "My name is Lalit and I a senior full stack architect";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        //collect.st

        collect.forEach(

                (k, v) ->
                    System.out.println(k + ", " + v.intValue())
        );

    }
}
