package com.example.service;

import com.example.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyRepository repository;

    public void processData() {
        System.out.println("Service: Processing data...");
        String data = repository.fetchData();  // This will throw an exception
        System.out.println("Data fetched: " + data);
    }
}