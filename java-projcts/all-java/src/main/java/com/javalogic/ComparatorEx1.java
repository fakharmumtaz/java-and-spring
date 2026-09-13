package com.javalogic;

import com.javalogic.model.Product;

import java.util.*;

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

        //Product p = new Product(1111, "Prod1", 2.5);
        List<Product> productList = List.of(new Product(2, "K", 5.51),
                                            new Product(4, "C", 45.52),
                                            new Product(3, "G", 25.54),
                                            new Product(6, "E", 35.55),
                                            new Product(1, "W", 6.59)
                                          );
                //;;new ArrayList<>();
        productList.stream().filter(p -> p.getId() > 0).forEach(System.out::println);
        boolean b = productList.stream().allMatch(s -> s.getId() == 1);
        System.out.println(b);
        boolean b1 = productList.stream().anyMatch(a -> a.getId() == 20);
        System.out.println(b1);

    }
}