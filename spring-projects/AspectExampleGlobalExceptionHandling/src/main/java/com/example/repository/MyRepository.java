package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String fetchData() {
        System.out.println("Fetching data from repository...");
        ///throw new RuntimeException("Database connection failed...!");
        return "No exception thrown";
    }
}