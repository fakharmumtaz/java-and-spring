package com.javalogic.stream;

import com.javalogic.model.Product;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxEntryInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 9);
        map.put("AA", 4);
        map.put("AA2", 418);
        map.put("AA3", 148);
        map.put("BCC", 8);

        map.entrySet().stream().forEach(System.out::println);

        map.entrySet().stream().map(m -> m.getValue()).forEach(System.out::println);

        map.entrySet().stream().map(m -> m.getKey()).forEach(System.out::println);

        Integer max = map.entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                //.map(Map.Entry::getValue)
                .orElse(null);

        System.out.println("Max : " + max);

        //Comparator<Product> c = (p1, p2) -> {p1.getId().co};
    }
}
