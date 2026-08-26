package com.javalogic.codprob;
public class PrintFibonacci {

    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            if(i == count)
                System.out.print(a);
            else
                System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(20);
    }
}