package com.example.service;

import org.springframework.stereotype.Service;
@Service
public class MyService {
    public void performTask() {
        System.out.println("Executing main business logic in performTask()");
    }

    public void throwError() {
        System.out.println("About to throw an exception...");
        throw new RuntimeException("Simulated exception");
    }
}
