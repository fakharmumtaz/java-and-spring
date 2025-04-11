package com.javalogic.thrd;
//A race condition occurs when two or more threads access shared data and try to change it at the same time. Because the thread scheduling is unpredictable, the final result may vary, leading to bugs that are hard to reproduce.
public class RaceConditionExample {
    static int counter = 0; // Shared variable
    public static void main(String[] args) throws InterruptedException {
        // Task 1
        Runnable task1 = () -> {
            for (int i = 0; i < 10000; i++) {
                counter++; // Not thread-safe
            }
        };

        // Task 2
        Runnable task2 = () -> {
            for (int i = 0; i < 10000; i++) {
                counter++; // Not thread-safe
            }
        };

        // Create threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();

        // Print the result
        System.out.println("Final counter value: " + counter);
    }
}
