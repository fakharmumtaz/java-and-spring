package com.javalogic.codprob;

public class Fibnocci {

    static  int result = 1;
    public static void main(String[] args) {
        //System.out.println("Hello world");
        // reverse a string
        String str = "Hello";

        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString());
        getFibnoci(10, 1);
    }

    public static void getFibnoci(int num, int num2) {
        int count =  num2;
        //if (num == 1)        return 1;

        if(count < 10)
            return ;

        System.out.println(result);

        result = result + num2;

        getFibnoci(count--, num2);



        //return  result;

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

