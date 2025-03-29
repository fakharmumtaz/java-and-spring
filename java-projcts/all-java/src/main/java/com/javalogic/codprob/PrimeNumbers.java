package com.javalogic.codprob;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    static List<Integer> facList = new ArrayList<>();
    static int divisor = 2;
    public static void main(String[] args) {
        //PrimeNumbers f = new PrimeNumbers();
        for (int i = 2 ; i <= 9923; i++) {
            int res = PrimeNumbers.factors(i);
            //System.out.println("number="+i);
            facList.add(res);
            if(facList.size()==2) {
                System.out.println("number="+i);
                System.out.println("factors:" + facList);
            }
            facList = new ArrayList<>();
            divisor = 2;
        }
    }

    // Method  To compute factors
    public static int factors(int n) {
        if (n <= 1)
            return 1;

        int remainder = n % divisor;
        int quotient = n / divisor;

        if( remainder == 0){
            facList.add(divisor);
            n = quotient;
        } else {
            divisor++;
        }
        return  factors(n);
    }

}