package com.javalogic;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ComparatorEx1 {
    public static void main(String[] args) {
        // Custom comparator: Sort strings by their length instead of alphabetically
        Comparator<String> lengthComparator = (k1, k2) -> Integer.compare(k1.length(), k2.length());

        // Pass the custom comparator into the TreeMap constructor
        Map<String, Integer> sortedMap = new TreeMap<>(lengthComparator);

        sortedMap.put("Elephant", 1);
        sortedMap.put("Caat", 2);
        sortedMap.put("Dog", 3);
        sortedMap.put("Henfg", 13);
        sortedMap.put("Giraffe", 4);

        // Output will be ordered by key length: Cat, Dog, Giraffe, Elephant
        System.out.println(sortedMap);
    }
}