package com.javalogic.stream;

//import com.javalogic.model.Product;

import java.util.List;

public class RecordExample {
    // A record automatically implements equals() and hashCode() based on id and name
    public record Product(int id, String name, double price) {}

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1, "Laptop", 1.1),
                new Product(2, "Phone", 2.5),
                new Product(1, "Laptop", 1.1) // Duplicate
        );

        List<Product> uniqueProducts = products.stream()
                .distinct()
                .toList(); // Available in modern Java instead of .collect(Collectors.toList())

        System.out.println(uniqueProducts);
        // Output: [Product[id=1, name=Laptop], Product[id=2, name=Phone]]
    }
}
