package com.javalogic.misc;

import java.util.Scanner;

public class InputFromKeyboard {
    //public class InputLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input;
            //System.out.print("input : " + input);
            while (true) {
                System.out.print("Enter an integer (or 0 to exit): ");
                input = scanner.nextInt();

                if (input == 0) {
                    System.out.println("Exiting loop.");
                    break; // Exit the loop if input is 0
                } else if (input > 0) {
                    System.out.println("You entered a positive number: " + input);
                } else {
                    System.out.println("You entered a negative number: " + input);
                }
            }

            String inputStr;
            while (true) {
                System.out.print("Enter a string (type 'exit' to quit): ");
                inputStr = scanner.nextLine();

                if (inputStr.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if the input is "exit"
                }

                // Perform your checks here
                System.out.println("You entered: " + inputStr);
                if(inputStr.equals("hello")) {
                    System.out.println("Greeting");
                }
            }

            scanner.close();
        }
    //}
}
