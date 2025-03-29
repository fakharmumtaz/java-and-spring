package org.example;

public class ReverseAString {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        // [9:24 PM] Ajayraj //provide a program to reverse a string using recursion

        //String s = "java is a programming language" ;
        String s = "java" ;
        System.out.println(s);
        //int leng = s.length();
        String ns = "";

        for(int i = s.length() - 1 ; i >= 0; i--) {
            Character c = s.charAt(i) ;
            ns += c.toString() ;
        }

        System.out.println(ns);

       /* for (int i = 0; i < s.length(); i++) {
           // Character c = s.charAt(i) ;
            String temp = s.substring(0);
            reverseAString(temp);
        }*/
        System.out.println(reverseAString(s));
        //reverseAsString(s.substring(1)) + s.charAt(0);
    }

    private static String reverseAString(String s) {
        if(s.isEmpty())
            return s;
        String cs = ((Character)s.charAt(0)).toString();
        String cs1 = s.substring(1);
        return  reverseAString(cs1)+ cs;
    }
}