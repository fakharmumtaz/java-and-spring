package com.javalogic.codprob;

public class Fibnocci {
    public static void main(String[] args) {
        int num = 10;
        //printFibonacci(num);
        //System.out.println();
        printFibonacci1(num);
        System.out.println();
        for(int i = 1; i <= num; i++ ){
            int res = printFibonacci2(i);
            System.out.println(res);
        }
    }

    /*private static void printFibonacci(int num) {
        int x = 0, y = 1, res=0;
        for (int i = 0 ; i < num; i++){
            res  =  x + y;
            System.out.println(res);
            x = y;
            y = res;
        }
    }*/

    private static void printFibonacci1(int num) {
        int x = 1, y = 1, z;
        for (int i = 1 ; i <= num; i++){
            System.out.println(x);
            z  =  x + y;
            x = y;
            y = z;
        }
    }

    public static int printFibonacci2(int n) {
        if(n <= 1)
            return n;
        return printFibonacci2(n-1) + printFibonacci2(n-2);
    }
}
//
//1
//1
//2
//3
//5
//8
//13

