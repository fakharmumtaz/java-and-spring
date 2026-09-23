package com.javalogic.str;

public class LongestPalindrome1 {
    public static void main(String[] args) {
        String s = "abababaa";
        Boolean b = checkPalindrome(s);
        System.out.println("Palindrome : " + b);

        allSubStrs("abc" ); /// [a, ab, abc, b, bc, c] // a, b, c, ab, bc, abc,
        allSubStrs("abcdef" );
    }

    static boolean checkPalindrome(String s){
        System.out.println(s);
        boolean isPalin = true;
        for(int i = 0; i < s.length()/2; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(s.length() - 1 - i) ;
            if(ch1!=ch2)
                return false ;
        }

        return isPalin;
    }

    static String[] allSubStrs(String s){
        System.out.println("??????????????  " +s);
        if (s == null || s.isEmpty())
            return new String[0];
        int n = s.length();
        // Formula to calculate total non-empty substrings
        String[] str  = new String[n * (n + 1) / 2];
        int start = 0;
        int ind = 0 ;
        for (int i = 0; i < s.length() ; i++) {
            start = i ;
            for (int j = i+1; j <= s.length()  ; j++) {
                String temp = s.substring(start,  j);
                System.out.println(temp);
            }
        }
        return str;
    }
}
