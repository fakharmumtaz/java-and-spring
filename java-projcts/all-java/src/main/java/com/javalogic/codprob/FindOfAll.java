package com.javalogic.codprob;

public class FindOfAll {
    public static void main(String[] args) {
        int n = 6;
        int res = findsum1(n);
        System.out.println("Sum of "+n+" and lesser numbers is "+res);
         res = findsum(n);
        System.out.println("Sum of "+n+" and lesser numbers is "+res);
    }

    public static  int findsum1( int n ) {

        return n * (n + 1) / 2;
    }

    private static int findsum(int n) {
        if(n <= 0 )
            return n;

        System.out.println(n);

        return  n + findsum(n-1);
    }
}
