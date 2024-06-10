package com.javalogic.codprob;

public class Fibnocci {
    public static void main(String[] args) {
        int res = getFibnoci1(90);
        //System.out.println(res);
        printFibonacci(10);
    }

    private static void printFibonacci(int num) {
        int x = 0, y = 1, res=0;
        for (int i = 0 ; i < num; i++){
            res  =  x + y;
            System.out.println(res);
            x = y;
            y = res;
        }
    }

    public static int getFibnoci1(int n) {

        if(n <= 1)
            return n;

        //System.out.println(n);

        return getFibnoci1(n-1) + getFibnoci1(n-2);
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

