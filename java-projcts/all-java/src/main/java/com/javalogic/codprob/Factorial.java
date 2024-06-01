package com.javalogic.codprob;

public class Factorial {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(5));
    }

    // Method
    // To compute factorial
    public int factorial(int n)
    {
        // Base case
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}