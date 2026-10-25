package com.javalogic.generics;

import java.util.List;

public class GenInterfaceDemo {
    public static void main(String[] args) {
        // 1. Using the generic implementation with String
        Repository<String> stringRepo = new InMemoryRepository<>();
        stringRepo.save("Java 21 Generics");
        stringRepo.save("Java 21 In-Memory Repository Example.");
        stringRepo.save("Java 22 In-Memory Repository Example;;;;.");


        List<String> allStrs = stringRepo.findAll();
        allStrs.stream().forEach(x ->
                processData(x)
        );

        // 2. Using the specific implementation with Product record
        Repository<Product> productRepo = new ProductRepository();
        productRepo.save(new Product("P100", "Laptop", 1200.00));

        List<Product> products = productRepo.findAll();
        Product product = products.getFirst(); // Java 21 Sequenced Collections feature

        // 3. Modern Java 21 Pattern Matching Example with the retrieved object
        processData(product);
    }

    private static void processData(Object obj) {
        // Java 21 pattern matching for switch
        switch (obj) {
            case Product p when p.price() > 1000 ->
                    System.out.println("Premium product found: " + p.name());
            case Product p ->
                    System.out.println("Standard product found: " + p.name());
            case String s ->
                    System.out.println("Text data length: " + s.length());
            default ->
                    System.out.println("Unknown object type");
        }
    }
}
