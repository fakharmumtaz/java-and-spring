package com.javalogic.codprob;

public class FindOfAll {
    public static void main(String[] args) {
        int n = 6;
        int res = findsum(n);
        System.out.println("Sum of "+n+" and lesser numbers is "+res);
    }

    private static int findsum(int n) {
        if(n <= 0 )
            return n;

        System.out.println(n);

        return  n + findsum(n-1);
    }
}
