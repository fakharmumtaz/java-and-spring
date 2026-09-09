package com.javalogic.codprob;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            // Ask the user for the number of rows
            System.out.print("Enter the number of rows for the pyramid: ");
            int rows = scanner.nextInt();

            if(rows<=0) break;

            // Outer loop handles the number of rows
            for (int i = 1; i <= rows; i++) {

                // Inner loop 1: Prints the leading spaces for alignment
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }

                // Inner loop 2: Prints the stars
                // The formula (2 * i - 1) ensures an odd number of stars per row
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                // Move to the next line after completing a row
                System.out.println();
            }
        }
        scanner.close();
    }
}

