package com.javalogic.str;

public class StringReversalRecursivly {
    public static void main(String[] args) {
        String s = "java";
        String r = reverseIt(s);
        System.out.println(s +" reversed "+ r);
    }

    private static String reverseIt(String s) {
        if(s.length()==0)
            return s;
        return s.substring(1) + s.charAt(0);
    }
}
