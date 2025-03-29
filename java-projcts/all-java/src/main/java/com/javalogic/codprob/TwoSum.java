package com.javalogic.codprob;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        TwoSum s = new TwoSum();
        //int[] a = {1, 3, 2};
        //int target = 4;

        int[] a = {1, 4, 5, 6, -3};
        int target = 3;

        System.out.println("Target = " + target);
        s.printArr(a);
        int[] b = s.twoSum(a, target);

        System.out.println("\nAnswer:");
        if(b[0] == -1 || b[1] == -1){
            System.out.println("Solution does not exist");
        } else {
            s.printArr(b);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        //int n = 0;
        int n1, n2;
        int k =  -1 ;
        b[0] = k;
        b[1] = k;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            n1 = nums[i];
            n2 = target - n1 ;
            if(!m.containsKey(n2)){
                m.put(n1, i);
            } else {
                k = m.get(n2);
                b[0]= k;
                b[1]= i;
                break;
            }
        }
        return b;
    }

    public void printArr(int[] ar) {
        if(ar != null ) {
            for(int i = 0; i < ar.length; i++) {
                System.out.println("ar["+(i)+"]  = "+ar[i]);
            }
        }
    }
}