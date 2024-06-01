package com.javalogic.stream.custcollector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GFG {
    public static void main(String[] args)
    {

        // Get the List
        List<String> g  = Arrays.asList("geeks", "for", "geeks");

        // Collect the list as map by groupingBy() method
        Map<String, Long> result  = g.stream().collect( Collectors.groupingBy( Function.identity(),   Collectors.counting()));

        // Print the result
        System.out.println(result);

        // Get the List
        List<Integer> intList  = Arrays.asList(5,3,2,4,7,1,4,5,7,8,8,7);

        // Collect the list as map by groupingBy() method
        Map<Integer, Long> resulta  = intList.stream().collect( Collectors.groupingBy( Function.identity(),   Collectors.counting()));

        // Print the result
        System.out.println(resulta);
    }
}