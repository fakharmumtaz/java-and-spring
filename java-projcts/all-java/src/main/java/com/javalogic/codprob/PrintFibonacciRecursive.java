package com.javalogic.codprob;
public class PrintFibonacciRecursive {

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    public static void main(String args[]) {
        int seqLength = 3;

        System.out.print("A Fibonacci sequence of " + seqLength + " numbers:\n");

        for (int i = 0; i < seqLength; i++) {
            if(seqLength==i+1)
                System.out.print(fibonacci(i));
            else
                System.out.print(fibonacci(i) + ", ");
        }
    }

}