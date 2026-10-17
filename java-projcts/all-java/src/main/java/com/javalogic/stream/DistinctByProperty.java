package com.javalogic.stream;

import com.javalogic.model.Product;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class DistinctByProperty {
    // Utility helper method to track seen keys
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    public static void main(String[] args) {
        // Let's assume Product doesn't override equals()
        List<Product> products = List.of(
                new Product(1, "Laptop", 1.1),
                new Product(1, "Upgraded Laptop", 2.6) // Distinct by 'id', so this is a duplicate
        );

        List<Product> uniqueById = products.stream()
                .filter(distinctByKey(Product::getId))
                .toList();

        System.out.println(uniqueById); // Keeps only the first occurrence: [Product{id=1, name='Laptop'}]
    }
}