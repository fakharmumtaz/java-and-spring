package com.javalogic.generics;

import java.util.*;

// The class remains generic and passes 'T' down to the interface
public class InMemoryRepository<T> implements Repository<T> {
    private final Map<String, T> database = new HashMap<>();

    @Override
    public void save(T entity) {
        // In a real app, you would extract an ID from the entity
        database.put(UUID.randomUUID().toString(), entity);
        System.out.println("Saved generic entity: " + entity);
    }

    @Override
    public Optional<T> findById(String id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(database.values());
    }
}

