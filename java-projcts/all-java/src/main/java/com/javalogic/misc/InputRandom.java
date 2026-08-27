package com.javalogic.misc;

import java.util.Random;

public class InputRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 20;
        int target = 5;
        while (true) {
            int randomNumber = random.nextInt(bound);
            System.out.println("Generatedd: " + randomNumber);
            if (randomNumber == target) {
                System.out.println("Target found!");
                break;
            } //else break;
        }
        int min = 10;
        int max = 20;
        while (true) {
            //int randomNumber = random.nextInt(bound);
            int randomNumber = random.nextInt(max - min) + min;
            System.out.println("Generated1:---- " + randomNumber);
            if (randomNumber == 15) {
                System.out.println("Target found!");
                break;
            }
        }
    }
}