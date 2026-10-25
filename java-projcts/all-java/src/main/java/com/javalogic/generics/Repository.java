package com.javalogic.generics;

//package com.example.generics;

import java.util.List;
import java.util.Optional;

// A generic interface parameterized over the entity type 'T'
public interface Repository<T> {
    void save(T entity);
    Optional<T> findById(String id);
    List<T> findAll();
}
