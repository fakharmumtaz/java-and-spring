package org.example;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingCharsUsingStream {
    // this program counts using of each character in a string
    public static void main(String[] args) {
        //String str = "My name is Sana and I a senior full stack architect";
        String str = "aabbbd";
        Map<Character, Long> collect
        = str.chars().mapToObj(c -> (char) c).collect(
                Collectors.groupingBy(c -> c, Collectors.counting()));

        collect.forEach(
                (k, v) ->  System.out.println("char="+k + ", count = " + v.intValue())
        );
    }
}
