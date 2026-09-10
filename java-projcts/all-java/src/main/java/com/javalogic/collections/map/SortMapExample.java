package com.javalogic.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 85);
        map.put("Python", 95);
        map.put("C++", 70);

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

        System.out.println(sortedMap);
        // Output: {C++=70, Java=85, Python=95}
    }
}