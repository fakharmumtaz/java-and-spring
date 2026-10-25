package com.javalogic.generics;

import java.util.*;

// The class is NOT generic; it specializes the Repository for 'Product'
public class ProductRepository implements Repository<Product> {
    private final Map<String, Product> productMap = new HashMap<>();

    @Override
    public void save(Product product) {
        productMap.put(product.id(), product);
        System.out.println("Saved product: " + product.name());
    }

    @Override
    public Optional<Product> findById(String id) {
        return Optional.ofNullable(productMap.get(id));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }
}

