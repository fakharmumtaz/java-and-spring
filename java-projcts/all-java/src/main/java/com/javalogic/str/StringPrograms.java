package com.javalogic.str;

public class StringPrograms {
    public static void main(String[] args) {

        //Write a program to see if its palindrome
        String s = "abba";

        boolean b = isPalindrome(s);
        System.out.println(b);
        s = "UniTED States s1 32 88 !@#$";
        countUpperLowerDigits(s);
        bringDigitAtTheStart(s);
    }

    private static void bringDigitAtTheStart(String s) {
        String d = "", r="";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                d = d + c;
            } else {
                r = r + c;
            }
        }
        System.out.println(s);
        System.out.println(d+r);
    }

    private static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            rev = c + rev;

        }
        System.out.println(rev);

        if(rev.equals(s)){
            System.out.println("PALINDROME");
        } else {
            System.out.println("Not PALINDROME");
        }
        return  rev.equals(s) ;
    }

    private static void countUpperLowerDigits(String s) {
        int count = 0, countl = 0, digits = 0, special = 0 ;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
            if(Character.isLowerCase(c)){
                countl++;
            }
            if(Character.isDigit(c)){
                digits++;
            }
            if(!Character.isAlphabetic(c)){
                special++;
                System.out.println(c);
            }
        }
        System.out.println(count + ", " + countl + ", " + digits + ", " + special );
    }
}
