package com.javalogic.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 85);
        map.put("Python", 45);
        map.put("C++", 70);
        map.put("AWS", 75);
        System.out.println("map : "+map);

        // Sort by value in ascending order
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Merge function (not needed here but required by syntax)
                        LinkedHashMap::new                // Guarantees insertion order is preserved
                ));

        System.out.println("sorted map : "+sortedMap);
        Map<String, Integer> sortedMap1 = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Merge function (not needed here but required by syntax)
                        LinkedHashMap::new                // Guarantees insertion order is preserved
                ));

        System.out.println("sorted map1 : "+sortedMap1);
        // Output: {C++=70, Java=85, Python=95}

        Map<String, Integer> map1 = map;
        //map1.put("Java", 125);
        //map1.put("Python", 95);
        //map1.put("C++", 100);

        LinkedHashMap<String, Integer> collect = map1.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new));
        System.out.println(" : "+collect);

        Map<String, Integer> unsortedMap = Map.of(
                "Java", 21,
                "Python", 3,
                "C++", 17,
                "Go", 1
        );

        // 4. Sort by Value (Descending)
        Map<String, Integer> sortedByValueDesc = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println("Sorted by Value (Desc): " + sortedByValueDesc);
    }
}