package com.javalogic.thrd;
public class SynchronizedExample {
    private static int counter = 0;

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        };

        Runnable task1 = () -> {
            for (int i = 0; i < 10000; i++) {
                //synchronized (lock) {
                    counter++;
                //}
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task1);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final counter value: " + counter);
    }
}

