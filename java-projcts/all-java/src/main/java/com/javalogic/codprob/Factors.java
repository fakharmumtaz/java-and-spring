package com.javalogic.codprob;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    List<Integer> facList = new ArrayList<>();
    public static void main(String[] args) {

        Factors f = new Factors();
        f.factoring();
    }

    public void factoring(){
        for (int i = 15 ; i <= 15; i++) {
            int res = factors(i);
            //System.out.println("number="+i);
            facList.add(res);
            //if(facList.size()==2) {
            System.out.println("number="+i);
            System.out.println("factors:" + facList);
            //}
            facList = new ArrayList<>();
            divisor = 2;
        }
    }

    // Method  To compute factors
    public int factors(int n) {
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
    static int divisor = 2;
}