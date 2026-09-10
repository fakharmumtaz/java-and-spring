package com.javalogic.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOnChar {
    public static void main(String[] args) {
        System.out.println("<<StreamOnChar>>");
        char str1[] = { 'd', 'u', 'n', 'j', 'a', 'r' };
        String st = new String(str1);
        //Stream<Character> charStream =
        st.chars().mapToObj(c -> (char) c).forEach(System.out::print);
        System.out.println();

        String str = "abcdABCDabcd";
        // get distinct characters and their count in a string?
        // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
        IntStream intStream = str.chars();
        System.out.print("ASCII Nos : ");
        intStream.forEach(System.out::print);
        System.out.println();
        System.out.print("Original Str: \t");
        IntStream intStream0 = str.chars();
        intStream0.mapToObj(i -> (char) i).forEach(System.out::print);
        System.out.println();
        System.out.print("Sorted Str: \t");
        IntStream intStream1 = str.chars();
        intStream1.mapToObj(c -> (char) c).sorted().forEach(System.out::print);
        System.out.println();
        System.out.print("Count of Str: \t");
        IntStream intStream2 = str.chars();
        long count = intStream2.mapToObj(i -> (char) i).count();// .forEach(System.out::print);
        System.out.println(count);
        //  System.out.println();
        System.out.print("Sorted Reverse of Str: \t");
        IntStream intStream3 = str.chars();
        intStream3.mapToObj(c -> (char) c).sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();
        System.out.print("Distinct of Str: \t");
        IntStream intStream4 = str.chars();
        intStream4.mapToObj(c -> (char) c).distinct().forEach(System.out::print);
        System.out.println();
        IntStream intStream5 = str.chars();
        List<Character> collect = intStream5.mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.println(collect);
        IntStream intStream6 = str.chars();
        Map<Character, List<Character>> collect1 = intStream6.mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity()));
        System.out.println(collect1);
        System.out.println();
        IntStream intStream7 = str.chars();
        Map<Character, Long> collect2 = intStream7.mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);
        Map<Character, Long> sortedMap = new TreeMap<>(collect2);
        System.out.println("Sorted Map ");
        System.out.println(sortedMap);

        //intStream2.mapToObj(c -> (char) c).sorted().forEach(System.out::print);
        System.out.println("All in Caps ");
        str.chars().mapToObj(c -> Character.toUpperCase((char)c)).forEach(System.out::print);

    }
}
