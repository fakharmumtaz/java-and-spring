package com.javalogic.codprob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args){

        TwoSum s = new TwoSum();
        //int[] a = {1, 3, 2};
        //int target = 4;

        int[] a = {1, 4, 5, 6, -3};
        int target = 2;

        System.out.println("Target = " + target);
        s.printArr(a);
        int[] b = s.twoSum(a, target);

        if(b[0] == -1 || b[1] == -1){
            System.out.println("Solution does not exist");
        } else {
            System.out.println("\nAnswer:");
            s.printArr(b);
        }

        b = s.twoSum1(a, target);

        if(b[0] == -1 || b[1] == -1){
            System.out.println("Solution does not exist");
        } else {
            System.out.println("\nAnswer:");
            s.printArr(b);
        }

        findFirstEx();
    }


    public int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        b[0] = -1;
        b[1] = -1;

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                //System.out.println(nums[i] + ", "+nums[j] + " = " + (nums[i] + nums[j] ) );
                if(nums[i] + nums[j] == target){
                    b[0] = i;
                    b[1] = j;
                    break;
                }
            }
        }

        return b;
    }

    public static void findFirstEx (){
        System.out.println("findFirst Ex: ");
        int[] numbers = {5, 12, 8, 21, 1};
        int target = 12;

        OptionalInt result = Arrays.stream(numbers)
                .filter(x -> x == target)
                .findFirst();

        // Safely extract the value or provide a fallback default
        int value = result.orElse(-1);

        System.out.println("Found: " + value); // Output: 12
    }

    public static int findIndexOfNum(int[] numbers,  int target) {
        //numbers = {5, 12, 8, 21, 1};
        //int target = 21;

        int index = IntStream.range(0, numbers.length)
                .filter(i -> numbers[i] == target)
                .findFirst()
                .orElse(-1); // Returns -1 if not found

        System.out.println("Index: " + index); // Output: 3
        return index;
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] b = new int[2];
        int n1;
        int k =  -1 ;
        b[0] = k;
        b[1] = k;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            n1 = nums[i];
            int n2Index;
            final int n2 = target - n1 ;
            boolean b1 = Arrays.stream(nums).anyMatch(n -> n == n2);

            if(b1){
                n2Index = findIndexOfNum(nums, n2);
                if(n2Index == i || n2Index == -1){
                    continue;
                }
                b[0]= i;
                b[1]= n2Index;
                break;
            }
        }
        return b;
    }

    public void printArr(int[] ar) {
        if(ar != null ) {
            for(int i = 0; i < ar.length; i++) {
                System.out.println("["+(i)+"]  = "+ar[i]);
            }
        }
    }
}